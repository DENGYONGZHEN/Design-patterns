package com.deng;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Classname Directory
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/20 16:00
 * @Created by helloDeng
 */
public class Directory extends Entry{
    private String name;
    private ArrayList directory  = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()){
            Entry entry = (Entry) iterator.next();
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry)  {
        directory.add(entry);
        return this;
    }
    public Iterator iterator(){
        return directory.iterator();
    }


    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
