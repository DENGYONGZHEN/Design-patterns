package com.deng;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Classname Directory
 * @Description        表示文件夹的类
 * @Version 1.0.0
 * @Date 2023/2/20 16:00
 * @Created by helloDeng
 */
public class Directory extends Entry{
    private String name;               //文件夹的名字
    private ArrayList directory  = new ArrayList();   //保存文件夹中的目录条目

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {            //遍历directory中的所有元素，计算出它们的大小总和
        int size = 0;
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()){
            Entry entry = (Entry) iterator.next();    //实际可能是file类型或者directory类型
            size += entry.getSize();         //如果里面还有子文件夹，还会调用子文件夹的getSize方法，递归调用
        }
        return size;
    }

    @Override
    public Entry add(Entry entry)  {
        directory.add(entry);
        return this;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()){
            Entry entry = (Entry) iterator.next();
            entry.printList(prefix + "/" +name);
        }
    }
}
