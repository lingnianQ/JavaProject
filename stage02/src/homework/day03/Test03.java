package homework.day03;

/**
 * 将当前目录下的所有obj文件获取到，并进行
 * 反序列化后输出每个用户的信息(直接输出反序
 * 列化后的User对象即可)
 * @author Xiloer
 *
 */
public class Test03 {
    public static void main(String[] args) {

    }
}

/*
    提示代码:
	需要用到的语句，尝试按照正确顺序将下列代码并放在main方法中完成需求，
	并在注释中标注每句话的作用，
	//【在这里标注该句代码意义】
    File dir = new File(".");

    //【在这里标注该句代码意义】
    for(int i=0;i<subs.length;i++){

    }

    //【在这里标注该句代码意义】
    File[] subs = dir.listFiles((f)->f.getName().endsWith(".obj"));

    //【在这里标注该句代码意义】
    FileInputStream fis = new FileInputStream(sub);

    //【在这里标注该句代码意义】
    File sub = subs[i];//从数组中获取每一个obj文件

    //【在这里标注该句代码意义】
    System.out.println(user);

    //【在这里标注该句代码意义】
    ObjectInputStream ois = new ObjectInputStream(fis);

    //【在这里标注该句代码意义】
    User user = (User)obj;

    //【在这里标注该句代码意义】
    Object obj = ois.readObject();

    //【在这里标注该句代码意义】
    if(obj instanceof User){

    }

 */