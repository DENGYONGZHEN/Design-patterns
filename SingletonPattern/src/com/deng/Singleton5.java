package com.deng;

/**
 * @Classname Singleton5
 * @Description  双重检查
 * @Version 1.0.0
 * @Date 2023/2/21 20:00
 * @Created by helloDeng
 *
 * 优缺点说明：
 * 1) Double-Check概念是多线程开发中常使用到的，如代码中所示，我们进行了两
 * 次if (singleton == null)检查，这样就可以保证线程安全了。
 * 2) 这样，实例化代码只用执行一次，后面再次访问时，判断if (singleton == null)，
 * 直接return实例化对象，也避免的反复进行方法同步.
 * 3) 线程安全；延迟加载；效率较高
 * 4) 结论：在实际开发中，推荐使用这种单例设计模式
 */
public class Singleton5 {
    private static volatile Singleton5 singleton;

    private Singleton5() {
    }

    public static synchronized Singleton5 getSingleton() {

        if (singleton==null) {
            synchronized (Singleton5.class){
                if(singleton == null){
                    singleton = new Singleton5();
                }
            }
        }
        return singleton;
    }
}
