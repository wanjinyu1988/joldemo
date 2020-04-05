package org.example;

import org.openjdk.jol.info.ClassLayout;

public class booleanTest {
    public static void main(String[] args) {
        printLayout(new boolean[5]);
    }
    private static void printLayout(Object o) {
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
    }
}
