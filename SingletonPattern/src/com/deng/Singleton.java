package com.deng;

/**
 * @Classname Singleton
 * @Description 单例模式
 * @Version 1.0.0
 * @Date 2023/2/15 14:29
 * @Created by helloDeng
 */
public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton(){
        System.out.println("创建了一个实例");
    }
    public static Singleton getInstance(){
        return singleton;
    }
}
