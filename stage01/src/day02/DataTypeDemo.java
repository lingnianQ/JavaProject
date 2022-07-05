package day02;

/**
 * 八种基本数据类型
 * byte,short,int,long,float,double,boolean,char
 */
public class DataTypeDemo {
    public static void main(String[] args) {
        /**
         * 整型 int 4字节
         */
        System.out.println(Integer.MIN_VALUE);

        /**
         * 长整型 long 8字节
         * 运算时避免溢出，建议第一个数后加 L  or  l
         */
        long l = 100000000011000L * 3 * 10;
        System.out.println(l);
        System.out.println(Long.MAX_VALUE);

        /**
         * double 浮点型 8字节
         * float 4字节
         * 浮点数默认为double--小数
         * float 后加 F，double 后加 D
         * double与float有舍入误差，不可进行精确运算
         */
        double d = 23.33;
        float f = 12.525f;
        double a = 3.0, b = 2.9;
        System.out.println(a - b); //0.10000000000000009

        /**
         * boolean 布尔型 1字节
         * true false
         */
        boolean flag = true;
        boolean flag2 = false;

        /**
         * char 字符型 2字节
         * Unicode编码格式，世界通用编码，通用定长（固定16位）字符集，
         * unicode被划分了很多个子集，java 的 char采用最通用的一个子集（中文、英文、符号、数字等）
         * 放入单引号 ''中，只可以装一个 '男'
         * char 字符型  本质为 int 65536个（0~65535）  'A'--65
         * ASCII码 'a'--97  '0'--48
         * 转义字符   \  \t \n
         */

        char c1 = '男';
        char c2 = 'f';
        char c3 = '6';
        char c4 = ' ';
        char c5 = 48; // '0'--48 -- 字符型 65536个（0~65535）本质int
        System.out.println(c5);

        char c6 = '\'';
        System.out.println(c6);

        /**
         * 类型转换
         * 自动/隐式 --
         * 强制转换 --大到小
         * byte  : 1个字节    8位
         * 最大值: 127   (有符号)
         *
         * short : 2个字节    16位           32767
         *
         * int :   4个字节    32位           2147483647
         *
         * long:   8个字节     64位           9223372036854775807
         *
         * float:   4个字节    32位           3.4028235E38
         *
         * double: 8个字节     64位            1.7976931348623157E308
         */
        byte b2 = 5;
        byte b3 = 6;
        byte b4 = (byte) (b2 + b3); //运算时强转

        //参与运算，转为int
        System.out.println(2 + '2');//52
        System.out.println('2' + '2');//100 , '2'的码50,50+50=100

        int b5 = '零'; //自动类型转换 -- 38646
        System.out.println(b5);
        int a1 = 5;
        long b1 = a1; //自动类型转换
        int c = (int) b1; //强制类型转换

        long d1 = 5; //自动类型转换
        double e = 5; //自动类型转换

        long l1 = 100000000000L;
        int g = (int) l1;
//        System.out.println(g); //1215752192, 强转有可能发生溢出

        double h = 25.987;
        int i = (int) h;
//        System.out.println(i); //25,强制转换有可能丢失精度

    }
}
