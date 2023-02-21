package com.deng;

/**
 * @Classname TestSingleton
 * @Description 测试单例
 * @Version 1.0.0
 * @Date 2023/2/15 14:33
 * @Created by helloDeng
 *
 * 单例模式就是将构造函数私有，只对外开放一个获取实例的静态方法，具体创建实例方式外部不可见
 *
 * 单例模式注意事项和细节说明
 * 1) 单例模式保证了 系统内存中该类只存在一个对象，节省了系统资源，对于一些需
 * 要频繁创建销毁的对象，使用单例模式可以提高系统性能
 * 2) 当想实例化一个单例类的时候，必须要记住使用相应的获取对象的方法，而不是使
 * 用new
 * 3) 单例模式使用的场景：需要频繁的进行创建和销毁的对象、创建对象时耗时过多或
 * 耗费资源过多(即：重量级对象)，但又经常用到的对象、工具类对象、频繁访问数
 * 据库或文件的对象(比如数据源、session工厂等)
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
