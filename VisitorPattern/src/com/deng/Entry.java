package com.deng;

import java.util.Iterator;

/**
 * @Classname Entry
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/20 15:48
 * @Created by helloDeng
 */
public abstract class Entry implements Element{
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    };
    public Iterator iterator() throws FileTreatmentException {
        throw new FileTreatmentException();
    };
    public String toString(){
        return getName() + "(" +getSize() + ")";
    }
}
