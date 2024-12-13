package org.example;

public class Demo1 {
    static String name = "test";
    final static String nameFinal = "test";

    public static void main(String[] args) {
        Demo1 o1 = new Demo1();
        o1.name = "Hello";
        //Hello
        System.out.println(o1.name);

        Demo1 o2 = new Demo1();
        //Hello
        System.out.println(o2.name);
        //Hello
        System.out.println(Demo1.name);
    }
}

