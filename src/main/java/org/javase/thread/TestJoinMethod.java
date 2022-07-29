package org.javase.thread;

public class TestJoinMethod extends Thread {

    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("我是："+Thread.currentThread().getName()+"xx"+i);
        }
    }

}
class TestJoinMethod2 extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("我是："+Thread.currentThread().getName()+"xx"+i);
        }
    }
}
class Test{
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            if(i==6){
                TestJoinMethod t1=new TestJoinMethod();
                t1.start();
                t1.join();
            }
            System.out.println("我是："+Thread.currentThread().getName()+i);
        }

    }
}
