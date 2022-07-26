package binary;

public class BinaryDemo {
    public static void main(String[] args) {
//        int n = 2147483647;
//        System.out.println(Integer.toBinaryString(n).length());
//        System.out.println(Integer.toBinaryString(n));
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.toHexString(n));
//
//        int a = 0x7fffffff; //16进制Hex
//        int b = 0b01111111_11111111_11111111_11111111; //二进制
//        int c = 0167; //8进制
//        System.out.println(a);
//        System.out.println(Integer.toHexString(a));
//        System.out.println(b);
//        System.out.println(c);
//        int n = -12;
//        int m = ~n + 1;
//        System.out.println(m == -n                                                     );
        int n = 110;
        int m = 255;
        int k = n & m;   //位与  遇0则0
        int k1 = n | m;  //位或  遇1则1
        int k2 = n ^ m;  //位异或
//        System.out.println(k + "   ," + k1 + "   ," + k2);


        int i = 0xdefa;
        System.out.println(Integer.toBinaryString(i));
        i >>= 4;
        System.out.println(Integer.toHexString(i));
        System.out.println(Integer.toBinaryString(i));

        int j = 0xadfb;
        System.out.println(Integer.toBinaryString(j));
        j <<= 4;
        System.out.println(Integer.toHexString(j));
        System.out.println(Integer.toBinaryString(j));

        int o = 0xabcd;
        System.out.println(Integer.toBinaryString(o));
        o >>= 4;
        System.out.println(Integer.toHexString(o));
        System.out.println(Integer.toBinaryString(o));

        int o1 = 0xabcd;
        System.out.println(Integer.toBinaryString(o1));
        o1 >>>= 4;
        System.out.println(Integer.toHexString(o1));
        System.out.println(Integer.toBinaryString(o1));

        int i1 = 6;
        i1 >>= 1;
        System.out.println(i1);
    }
}
