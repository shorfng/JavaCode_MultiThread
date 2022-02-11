package com.loto.multithread.mainthread;

/**
 * Author：蓝田_Loto
 * Date：2018-12-27 15:17
 * <p>PageName：.java
 * </p>
 * <p>Function：
 */

public class a_MainThread {
    public static void main(String[] args) {
        Person d1 = new Person("TD");
        Person d2 = new Person("CJ");

        d1.show();
        d2.show();

        System.out.println("Hello World!");
    }
}
