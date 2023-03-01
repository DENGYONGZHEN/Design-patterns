package com.deng;

import java.util.Iterator;

/**
 * @Classname ListVisitor
 * @Description         Visitor的子类，显示文件和文件夹一览
 * @Version 1.0.0
 * @Date 2023/2/26 12:00
 * @Created by helloDeng
 */
public class ListVisitor extends Visitor{
    private String currentDir = "";            //现在正在访问的文件夹名字
    @Override
    public void visit(File file) {             //在访问文件时被调用

        System.out.println(currentDir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {          //在访问文件夹时被调用
        System.out.println(currentDir + "/" + directory);
        String saveDir  = currentDir;
        currentDir = currentDir + "/" + directory.getName();
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()){
            Entry next = (Entry) iterator.next();
            next.accept(this);                      //visit和accept方法互相递归调用
        }
        currentDir = saveDir;
    }
}
