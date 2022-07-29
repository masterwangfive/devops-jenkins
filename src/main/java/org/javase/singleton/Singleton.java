package org.javase.singleton;

/**
 * 单例模式
 */
public class Singleton {
    //1. 创建私有的构造方法
    private Singleton(){}
    //2. 创建私有的静态内部类
    private static  class SingletonHoler{
        //3. 创建私有的静态final 的对象
        private static  final Singleton singleton=new Singleton();
    }
    //4. 创建共有的静态方法，供外部调用使用
    public static Singleton getInstance(){
       return SingletonHoler.singleton;
    }
}
