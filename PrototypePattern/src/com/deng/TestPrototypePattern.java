package com.deng;

/**
 * @Classname TestPrototypePattern
 * @Description        通过复制生成实例
 * @Version 1.0.0
 * @Date 2023/2/15 20:22
 * @Created by helloDeng
 * Product是复制功能的接口，继承了Cloneable接口,定义了两个抽象方法，use和creatClone
 * Manager中定义了一个map集合用于存储实例名和实例对象，还有一个create方法接收实例名，可以获取实例对象去创建实例
 * MessageBox实现了Product接口 重写了use和creatClone 其中creatClone 中调用java的clone方法创建对象
 * UnderLinePen实现了Product接口 重写了use和creatClone其中creatClone 中调用java的clone方法创建对象
 *
 *PrototypePattern：1、对象种类繁多，无法将他们整合到一个类中时
 *                  2、难以根据类生成实例时
 *                  3、想解耦框架与生成的实例时
 *
 *
 * clone方法只是浅复制：将被复制实例的字段值直接复制到新的实例中去，例如实例中的数组，只会复制该数组的引用
 */
public class TestPrototypePattern {
    public static void main(String[] args) {

        Manager manager = new Manager();
        //创建实例
        UnderLinePen uPen = new UnderLinePen('~');
        MessageBox mBox = new MessageBox('*');
        MessageBox sBox = new MessageBox('/');
        //注册实例
        manager.register("strong message",uPen);
        manager.register("warning box",mBox);
        manager.register("slash box",sBox);
        //通过实例创建实例
        Product strong_message = manager.create("strong message");
        Product warning_box = manager.create("warning box");
        Product slash_box = manager.create("slash box");

        strong_message.use("hello world");
        warning_box.use("hello world");
        slash_box.use("hello world");
    }
}
