package apiday02;

import java.util.Objects;

/**
 * alt+ins
 */
public class ObjectDemo {
    public static void main(String[] args) {
//        Aoo aoo = new Aoo(25, "lingnian");
//        Aoo aoo1 = new Aoo(25, "lingnian");
//        System.out.println(aoo.equals(aoo1));
//        System.out.println(aoo);
        String a = new String("qwe");
        String a1 = new String("qwe");
        StringBuilder b = new StringBuilder("qwe");
        System.out.println(a.equals(a1));
    }

}

class Aoo {
    private int a;
    private String b;

    public Aoo(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Aoo{" +
                "a=" + a +
                ", b='" + b + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aoo aoo = (Aoo) o;
        return a == aoo.a && Objects.equals(b, aoo.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}