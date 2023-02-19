package com.deng;

/**
 * @Classname Display
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/19 19:18
 * @Created by helloDeng
 */
public class Display {
    private DisplayImpl imp;

    public Display(DisplayImpl imp) {
        this.imp = imp;
    }
    public void open(){
        imp.rawOpen();
    }
    public void print(){
        imp.rawPrint();
    }
    public void close(){
        imp.rawClose();
    }
    public final void display(){
        open();
        print();
        close();
    }
}
