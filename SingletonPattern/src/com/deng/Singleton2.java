package com.deng;

/**
 * @Classname Singleton2
 * @Description 懒汉式(线程不安全)
 * @Version 1.0.0
 * @Date 2023/2/21 19:41
 * @Created by helloDeng
 *
 * 优缺点说明：
 * 1) 起到了Lazy Loading的效果，但是只能在单线程下使用。
 * 2) 如果在多线程下，一个线程进入了if (singleton == null)判断语句块，还未来得及
 * 往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。所以
 * 在多线程环境下不可使用这种方式
 * 3) 结论：在实际开发中，不要使用这种方式.
 */
public class Singleton2 {
    private static Singleton2 singleton;

    private Singleton2() {
    }

    public static Singleton2 getSingleton() {

        if (singleton==null) {
            singleton = new Singleton2();
        }
        return singleton;
    }
}
