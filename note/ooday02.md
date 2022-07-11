1. 内存管理：由JVM来管理的

- 堆：new出来的对象（包括成员变量）
- 栈：局部变量 以及方法的参数

![1.png](https://github.com/lingnianQ/JavaProject/blob/master/note/images/1.png?raw=true)



~~~java
class Aoo{
    Student zs; //堆中（装地址）
    int a;  //堆中（装值）
    void test(){
        Student ls; //栈中（装地址）
        int b; //栈中（装值）
    }
}
~~~

~~~java
class Aoo{   //Aoo o = new Aoo; --- a=0
    int a;   
    void show(int b){ // o.show(25); --- b=25
        int c;  //-------c 未初始化
        System.out.println(a);
        System.out.println(b);       						System.out.println(c); //编译错误--变量使用前，必须声明并初始化
    }
}
~~~







