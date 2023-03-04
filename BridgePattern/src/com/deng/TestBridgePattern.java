package com.deng;

/**
 * @Classname TestBridgePattern
 * @Description    将类的功能层次结构与实现层次结构分离
 * @Version 1.0.0
 * @Date 2023/2/19 19:15
 * @Created by helloDeng
 *类的功能层次结构：父类具有基本功能,在子类中增加新功能
 *类的实现层次结构：父类通过声明抽象方法来定义接口，子类通过实现具体方法来实现接口
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
