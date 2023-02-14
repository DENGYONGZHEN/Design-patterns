package com.deng;

/**
 * @Classname AbstractDisplay
 * @Description 抽象类
 * @Version 1.0.0
 * @Date 2023/2/13 20:07
 * @Created by helloDeng
 */
public abstract class AbstractDisplay {
    public abstract void open();
    public abstract void print();
    public abstract void close();
    public final void display(){
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    };
}
