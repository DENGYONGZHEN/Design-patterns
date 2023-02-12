package com.deng;

/**
 * @Classname AdapterTest
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/12 20:50
 * @Created by helloDeng
 *
 * 适配器Adapter模式也叫Wrapper模式，当存在现有程序无法直接使用，需要做适当变换之后才能使用
 * 适配器模式第一种：类适配器模式(使用继承的适配器)
 * PrintBanner担任适配器角色  Print是接口，Banner是实体类，此时就是Banner实体类无法直接使用
 * PrintBanner继承Banner实现Print，把Banner中的方法包装一下，创建Print类型的实例，
 * 直接调用Print接口里定义的方法，方法里面再调用Banner里的方法，因为继承可以直接使用父类Banner中的方法
 *
 */
public class AdapterTest {
    public static void main(String[] args) {
        //这里用的是print接口
        Print hello = new PrintBanner("hello");
        hello.printWeak();
        hello.printStrong();
    }
}
