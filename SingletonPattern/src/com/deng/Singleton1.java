package com.deng;

/**
 * @Classname Singleton1
 * @Description 饿汉式（静态代码块）
 * @Version 1.0.0
 * @Date 2023/2/21 19:34
 * @Created by helloDeng
 *
 * 优缺点说明：
 * 1) 这种方式和Singleton饿汉式 （静态常量）类似，只不过将类实例化的过程放在了静态代码块
 * 中，也是在类装载的时候，就执行静态代码块中的代码，初始化类的实例。优
 * 缺点和上面是一样的。
 * 2) 结论：这种单例模式可用，但是可能造成内存浪费
 */
public class Singleton1 {
    private static Singleton1 singleton;
    static {
        singleton = new Singleton1();
    }
    private Singleton1(){
        System.out.println("创建了一个实例");
    }
    public static Singleton1 getInstance(){
        return singleton;
    }
}
