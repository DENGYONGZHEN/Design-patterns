package com.deng;

/**
 * @Classname Singleton3
 * @Description 懒汉式(线程安全 ， 同步方法)
 * @Version 1.0.0
 * @Date 2023/2/21 19:48
 * @Created by helloDeng
 *
 * 优缺点说明：
 * 1) 解决了线程不安全问题
 * 2) 效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行
 * 同步。而其实这个方法只执行一次实例化代码就够了，后面的想获得该类实例，
 * 直接return就行了。方法进行同步效率太低
 * 3) 结论：在实际开发中，不推荐使用这种方式
 */
public class Singleton3 {
    private static Singleton3 singleton;

    private Singleton3() {
    }

    public static synchronized Singleton3 getSingleton() {

        if (singleton==null) {
            singleton = new Singleton3();
        }
        return singleton;
    }
}
