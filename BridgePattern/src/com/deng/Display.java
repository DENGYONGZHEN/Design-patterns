package com.deng;

/**
 * @Classname Display
 * @Description   负责"显示"的类 ,类的功能层次的最上层
 * @Version 1.0.0
 * @Date 2023/2/19 19:18
 * @Created by helloDeng
 */
public class Display {
    private DisplayImpl imp;         //实现类的实例，作为功能层次结构和实现层次结构的桥梁

    public Display(DisplayImpl imp) {
        this.imp = imp;
    }
    public void open(){
        imp.rawOpen();
    }       //显示前处理
    public void print(){
        imp.rawPrint();
    }      //显示处理
    public void close(){
        imp.rawClose();
    }     //显示后的处理
    public final void display(){
        open();
        print();
        close();
    }
}
