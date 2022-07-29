package org.javase.thread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return new Random().nextInt(10); //创建10以内的随机数
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable myc=new MyCallable();
        FutureTask ft= new FutureTask(myc);
        Thread t1=new Thread(ft);
        t1.start();
        Object o = ft.get();
        System.out.println(o);
    }
}
