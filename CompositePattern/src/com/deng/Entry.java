package com.deng;

import java.io.FileNotFoundException;

/**
 * @Classname Entry
 * @Description     抽象类，用来实现File类和Directory类的一致性
 * @Version 1.0.0
 * @Date 2023/2/20 15:48
 * @Created by helloDeng
 */
public abstract class Entry {
    public abstract String getName();       //获取名字
    public abstract int getSize();         //获取大小
    public Entry add(Entry entry) throws FileTreatmentException {   //加入目录条目
        throw new FileTreatmentException();
    };
    public void printList(){
        printList("");
    }        //显示目录条目一览

    protected abstract void printList(String prefix); //为一览加上前缀并显示目录条目一览
    public String toString(){
        return getName() + "(" +getSize() + ")";
    }
}
