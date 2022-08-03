package socket;

import java.io.*;
import java.net.Socket;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client extends Socket {
    private Socket socket;



    public Client() {
        try {
            System.out.println("正在连接服务器...");
            socket = new Socket("176.17.2.249", 8088);
//            socket = new Socket("176.17.200.191", 8088);
//            socket = new Socket("176.17.2.243", 8088);
            System.out.println("服务器连接成功...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        try {
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osw);
            //(bw,true)---- java.net.SocketException: Connection reset
            PrintWriter pw = new PrintWriter(bw, true);
            Scanner scanner = new Scanner(System.in);

            while (true) {
                String line = scanner.nextLine();
                if ("exit".equals(line)) {
                    pw.close();
                    break;
                }
                pw.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) throws IOException {
        Client client = new Client();
        client.start();
    }
}
