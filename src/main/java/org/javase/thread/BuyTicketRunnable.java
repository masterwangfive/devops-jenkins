package org.javase.thread;

public class BuyTicketRunnable implements Runnable{
    final  static Object o =new Object();
      // final String s="abc";
    // BuyTicketRunnable.class  //也可以用这个
    int ticketNum=50;
    @Override
    public void run() {
        for( int i =1;i<100;i++){
//            synchronized (o) {  // 这个锁在多线程中必须是同一把锁 这里用（this）是因为只创建了一个对象，这样就是同一把锁了。
//                if (ticketNum > 0) {
//                    System.out.println("我在：" + Thread.currentThread().getName() + "买了那个票：" + ticketNum--);
//                }
            buyTicket();
            }

    }

    public synchronized void buyTicket(){ //这里锁，相当于锁住了this ,因为调用的时候都是同一个对象在调用
        if (ticketNum > 0) {
            System.out.println("我在：" + Thread.currentThread().getName() + "买了那个票：" + ticketNum--);
        }
    }
}
