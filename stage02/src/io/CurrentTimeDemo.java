package io;

public class CurrentTimeDemo {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        l = l / 1000 / 60 / 60 / 24 / 365 + 1970;
        System.out.println(l);
    }
}
