package com.loto.multithread.threadsecurity;

/**
 * Author：蓝田_Loto
 * Date：2018-12-27 19:38
 * <p>PageName：c_Lock.java
 * </p>
 * <p>Function：解决线程安全问题方式（最终版）_使用Lock接口
 */

public class c_Lock {
    public static void main(String[] args) {
        // 创建票对象
        Ticket3 ticket = new Ticket3();

        //创建3个窗口
        Thread t1 = new Thread(ticket, "窗口1");
        Thread t2 = new Thread(ticket, "窗口2");
        Thread t3 = new Thread(ticket, "窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
