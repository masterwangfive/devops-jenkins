package org.javase.thread;

public class BuyTicketThread extends Thread{


    public BuyTicketThread(String name){
        super(name);
    }

   static int  ticketSum= 10;  //多个对象共享的时候加个static
   final static Object object=new Object(); // 创建锁对象（只能创建一个，该对象相当于锁，多个线程共用同一把锁）
/**
 * 出现了重复的问题
 */

    public void run () {

            for (int i = 1; i <= 100; i++) {
                synchronized (object) {
                if (ticketSum > 0) {
                    System.out.println("我在" + this.getName() + "买到了" + ticketSum-- + "张票了");
                }
            }
        }
}

// 方式二： 同步方法；


    // 因为是有多个对象，所以相当于是有多个锁，所以加个static才行,
    // 相当于锁住了BuyTicketThread.calss
    public static synchronized void ticket(){

        for (int i = 1; i <= 100; i++) {
            if (ticketSum > 0) {

                System.out.println("我在" + Thread.currentThread().getName() + "：买到了第" + ticketSum-- + "票了");
            }
        }
    }
}
