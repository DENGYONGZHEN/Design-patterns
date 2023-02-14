package com.deng;

/**
 * @Classname TestFactoryMethodPattern
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/13 20:47
 * @Created by helloDeng
 *
 *FactoryMethodPattern 工厂方法模式 用于创建实例和templateMethod类似
 * Factory是父类，create()方法决定实例的生成方式，但不决定所要生成的具体的类，具体的处理全部交给子类IdCardFactory负责
 * 就可以将生成实例的框架和实际负责生成实例的类解耦
 */
public class TestFactoryMethodPattern {
    public static void main(String[] args) {

        Factory factory = new IdCardFactory();
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小红");
        Product card3 = factory.create("小刚");
        card1.use();
        card2.use();
        card3.use();
    }
}
