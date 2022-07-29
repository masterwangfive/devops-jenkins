package org.javase.thread.consumerproducer.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 商品类
 */
public class Commodity {
    String brand;
    String name;
    // 红色：有商品，消费者可以消费  绿色：没有商品，生产者可以生产
    boolean flag = false;  //默认没有商品，先开始生产，然后再消费

    Lock lock =new ReentrantLock();
    Condition produceCondition =lock.newCondition();
    Condition consumerCondition=lock.newCondition();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 生产者同步方法 注意this的用法，还是要注意锁的时候到底锁的是那个东西？
     * @param brand
     * @param name
     */
    public  void producerProduct(String brand, String name) throws InterruptedException {
        lock.lock();
        try{
            if(flag){ // 如果灯是红色的，表示有商品了，等着让消费者去消费
               // wait();
                // true 表示有商品了，等待消费者去消费
                consumerCondition.await();
            }
            //灯是绿色的，生产
            this.setBrand(brand);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setName(name);
            System.out.println("我是生产者：我生产了"+this.getBrand()+"-----"+this.getName());

            flag=true; //灯变成红色
           // notify(); //通知其他线程可以消费了
            produceCondition.signal(); // 生产完了，通知消费者去消费
        }
        finally {
            lock.unlock();
        }
    }

    /**
     * 消费者
     */
    public   void consumerProduct(){
        lock.lock();
      try {
          if (!flag){
              try {
                 // wait();
                  produceCondition.await(); //消费完了，等待生产者生产
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }

          System.out.println("我是消费者：我消费了" + this.getBrand() + "-----" + this.getName());
          flag=false; //灯变成绿色
          //notify(); //通知生产者可以生产了
          consumerCondition.signal();  //消费完了，通知生产者可以生产了
      }
      finally {
          lock.unlock();
      }
    }

}
