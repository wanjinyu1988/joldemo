package org.example;

import org.openjdk.jol.info.ClassLayout;

public class Person {
    long age;
    Long card;
    String name;

    public static void main(String[] args) {
        printLayout(new Person());
    }

    private static void printLayout(Object o) {
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
    }
}
