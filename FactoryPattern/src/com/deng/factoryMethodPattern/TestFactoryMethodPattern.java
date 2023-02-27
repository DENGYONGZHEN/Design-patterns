package com.deng.factoryMethodPattern;

import java.util.Scanner;

/**
 * @Classname TestFactoryMethodPattern
 * @Description  工厂方法
 * @Version 1.0.0
 * @Date 2023/2/22 23:37
 * @Created by helloDeng
 *
 *
 * 工厂方法模式介绍
 * 工厂方法模式设计方案：将披萨项目的实例化功能抽象成抽象方法，在不同的口味点
 * 餐子类中具体实现。
 * 工厂方法模式：定义了一个创建对象的抽象方法，由子类决定要实例化的类。工厂方
 * 法模式将对象的实例化推迟到子类。
 *
 * PizzaStore 就是工厂
 */
public class TestFactoryMethodPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String next = scanner.next();
            PizzaStore store = new ChicagoStylePizzaStore();
            store.orderPizza(next);
        }
    }
}
