package com.deng;

import java.util.Iterator;

/**
 * @Classname Entry
 * @Description       File类和Directory类的父类，是抽象类
 * @Version 1.0.0
 * @Date 2023/2/20 15:48
 * @Created by helloDeng
 */
public abstract class Entry implements Element{
    public abstract String getName();          //获取名字
    public abstract int getSize();             //获取大小

    /**
     * 此方法只对Directory类有效，所以此处报错
     * @param entry
     * @return
     * @throws FileTreatmentException
     */
    public Entry add(Entry entry) throws FileTreatmentException {     //增加目录条目
        throw new FileTreatmentException();
    };

    /**
     * 此方法只对Directory类有效，所以此处报错
     * @return
     * @throws FileTreatmentException
     */
    public Iterator iterator() throws FileTreatmentException {              //生成iterator
        throw new FileTreatmentException();
    };
    public String toString(){
        return getName() + "(" +getSize() + ")";
    }
}
