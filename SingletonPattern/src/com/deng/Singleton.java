package com.deng;

/**
 * @Classname Singleton
 * @Description 单例模式 饿汉式 （静态常量）
 * @Version 1.0.0
 * @Date 2023/2/15 14:29
 * @Created by helloDeng
 *
 * 优缺点说明：
 * 1) 优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同
 * 步问题。
 * 2) 缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始
 * 至终从未使用过这个实例，则会造成内存的浪费
 * 3) 这种方式基于classloder机制避免了多线程的同步问题，不过，instance在类装载
 * 时就实例化，在单例模式中大多数都是调用getInstance方法， 但是导致类装载
 * 的原因有很多种，因此不能确定有其他的方式（或者其他的静态方法）导致类
 * 装载，这时候初始化instance就没有达到lazy loading的效果
 * 4) 结论：这种单例模式可用，可能造成内存浪费
 */
public class Singleton {
    private final static Singleton singleton = new Singleton();
    private Singleton(){
        System.out.println("创建了一个实例");
    }
    public static Singleton getInstance(){
        return singleton;
    }
}
