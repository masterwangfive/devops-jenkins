package org.javase.thread.consumerproducer.synchronize;

public class TestCommondity {
    public static void main(String[] args) {
        Commodity c=new Commodity();
        ProducerThread p1=new ProducerThread(c);
        ConsumerThread c1=new ConsumerThread(c);
        p1.start();
        c1.start();
    }
}
