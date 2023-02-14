package com.deng;

import java.io.InputStream;

/**
 * @Classname TestTemplateMethodPattern
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/13 20:19
 * @Created by helloDeng
 * TemplateMethodPattern 模板方法模式：在父类中定义处理流程的框架，在子类中实现具体处理
 * AbstractDisplay是一个抽象类，定义了抽象方法，在display()方法中定义了其他抽象方法的调用顺序
 * 此时display()方法就是模板方法
 * CharDisplay和StringDisplay是继承了AbstractDisplay，重写了其他的抽象方法，定义了具体处理
 *
 */
public class TestTemplateMethodPattern {

    public static void main(String[] args) {
        AbstractDisplay c = new CharDisplay('c');
        StringDisplay display = new StringDisplay("学习一道");
        c.display();
        display.display();

    }
}
