package day03;

/**
 * 运算符的演示
 */
public class OperDemo {
    public static void main(String[] args) {
        /**
         *算术运算符+/*-  优先级大于关系运算符
         * a++ 值为  a     ---  单独或者被使用
         * ++a 值为 a+1
         */
        int a = 5, b = 5;
        int c = a++; //1）先将a++ （a） 的值赋值给c， 2）再进行a++  a=a+1
//        int c = a--; //1）先将a-- （a） 的值赋值给c， 2）再进行a--  a=a-1
        int d = ++b;
//        int d = --b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c); //5 --- a++ ， c = (a)
        System.out.println(d);

        /**
         * 优先级小于算术运算符
         *
         *关系运算 > < =  ---结果为 true  false
         */

//        System.out.println(a++>6); //false
//        System.out.println(--a>6); //true
        /**
         *  &&  逻辑与（并且）
         *  ||  逻辑或（）
         *  !  非
         */
        System.out.println("******************");
        System.out.println("******************");
        System.out.println("******************");
        System.out.println("******************");
        System.out.println("******************");
    }
}
