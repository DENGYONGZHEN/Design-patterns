package com.deng;

import java.io.FileNotFoundException;

/**
 * @Classname Entry
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/20 15:48
 * @Created by helloDeng
 */
public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    };
    public void printList(){
        printList("");
    }

    protected void printList(String prefix) {
    }
    public String toString(){
        return getName() + "(" +getSize() + ")";
    }
}
