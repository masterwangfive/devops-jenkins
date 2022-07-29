package org.javase.thread;

public class TestRunnable {

    /**
     * 练习使用Runnable 创建线程
     * @param args
     */

    public static void main(String[] args) {
//        MyRunnable my=new MyRunnable();
//        Thread t=new Thread(my);
//
//        t.start();
//        for(int i=0;i<100;i++){
//            System.out.println("我是："+Thread.currentThread().getName()+i);
//        }

        BuyTicketRunnable br=new BuyTicketRunnable();
        Thread t1=new Thread(br,"窗口1");
        t1.start();
        Thread t2=new Thread(br,"窗口2");
        t2.start();
        Thread t3=new Thread(br,"窗口3");
        t3.start();

    }
}
