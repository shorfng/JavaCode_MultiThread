package com.loto.multithread.mainthread;

/**
 * Author：蓝田_Loto
 * Date：2018-12-27 15:24
 * <p>PageName：.java
 * </p>
 * <p>Function：
 */

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Person(String name) {
        this.name = name;
    }

    void show() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println("name=" + name + ",i=" + i);
        }
    }
}
