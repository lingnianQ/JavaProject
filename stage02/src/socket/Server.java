package socket;

import lombok.Synchronized;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Server {
    private ServerSocket serverSocket;
    private PrintWriter[] allOut = {};

    public Server() {
        try {
            System.out.println("正在启动服务端...");
            serverSocket = new ServerSocket(8080);
            System.out.println("服务端启动完毕...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        try {
            while (true) {
                System.out.println("等待客户端连接...");
                Socket socket = serverSocket.accept();
                System.out.println("一个客户端连接了...");
                //启动一个线程进行客户端交互
                ClientHandler handler = new ClientHandler(socket);
                Thread t = new Thread(handler);
                t.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private class ClientHandler implements Runnable {
        private Socket socket;

        private String host;//记录当前对应客户端的IP地址

        public ClientHandler(Socket socket) {
            this.socket = socket;
            //this.host = socket.getInetAddress().getHostAddress();
            this.host = socket.getInetAddress().getHostName() + ": " + socket;
        }

        @Override
        public void run() {
            inputAndOut();
        }

        private void inputAndOut() {
            PrintWriter pw = null;
            try {
                InputStream input = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(input, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);

                OutputStream out = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(out);
                BufferedWriter bw = new BufferedWriter(osw);
                pw = new PrintWriter(bw, true);

                synchronized (Server.this) {
                    allOut = Arrays.copyOf(allOut, allOut.length + 1);
                    allOut[allOut.length - 1] = pw;
                }

                sendMessage(host + "上线了，当前在线人数：" + allOut.length);

                String line;
                while ((line = br.readLine()) != null) {
                    sendMessage(host + ": " + line);
                }
            } catch (IOException e) {
//                e.printStackTrace();
            } finally {
                for (int i = 0; i < allOut.length; i++) {
                    if (allOut[i] == pw) {
                        allOut[i] = allOut[allOut.length - 1];
                        allOut = Arrays.copyOf(allOut, allOut.length - 1);
                        break;
                    }
                    sendMessage(host + "下线了，当前在线人数：" + allOut.length);
                }
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        private void sendMessage(String message) {
            System.out.println(message);
            synchronized (Server.this) {
                //将消息发送给所有客户端
                for (PrintWriter printWriter : allOut) {
                    printWriter.println(message);
                }
            }
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }
}
