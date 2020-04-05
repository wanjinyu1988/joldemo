package org.example;

import org.openjdk.jol.info.ClassLayout;

public class ArrayTest {
    public static void main(String[] args) {
        printLayout(new Long[5]);
        printLayout(new long[5]);
    }
    private static void printLayout(Object o) {
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
    }
}