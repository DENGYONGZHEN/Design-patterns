package com.deng;

/**
 * @Classname TestSingleton
 * @Description 测试单例
 * @Version 1.0.0
 * @Date 2023/2/15 14:33
 * @Created by helloDeng
 *
 * 单例模式就是将构造函数私有，只对外开放一个获取实例的静态方法，具体创建实例方式外部不可见
 */
public class TestSingleton {
    public static void main(String[] args) {
        System.out.println("start");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        if(singleton1 == singleton2){
            System.out.println("是同一个实例");
        }else{
            System.out.println("不是一个实例");
        }
        System.out.println("end");
    }
}
