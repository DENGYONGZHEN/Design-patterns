package com.deng;

/**
 * @Classname TestBridgePattern
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/19 19:15
 * @Created by helloDeng
 *
 * BridgePattern:将类的功能层级结构和类的实现层次结构连接起来
 * 出现的角色：1、Abstraction（抽象化）位于类的功能结构的层次的最上层，使用Implementor角色的方法定义了基本功能，
 * 该角色中保存了Implementor角色的实例  ,Display
 * 2、RefinedAbstraction（改善后的抽象化）,在抽象化的基础上增加了新功能，CountDisplay
 * 3、实现者，位于实现层级结构的最上层，定义了用于实现抽象化的接口 DisplayImpl
 * 4、具体实现者，StringDisplayImpl 负责实现实现者中定义的接口
 */
public class TestBridgePattern {
    public static void main(String[] args) {
        Display display1 = new Display(new StringDisplayImpl("hello,moon"));
        Display display2 = new CountDisplay(new StringDisplayImpl("hello,sun"));
        CountDisplay countDisplay = new CountDisplay(new StringDisplayImpl("hello,star"));
        RandomCountDisplay randomCountDisplay = new RandomCountDisplay(new StringDisplayImpl("hello,sky"));
        display1.display();
        display2.display();
        countDisplay.multiDisplay(5);
        randomCountDisplay.randomDisplay(10);
    }
}
