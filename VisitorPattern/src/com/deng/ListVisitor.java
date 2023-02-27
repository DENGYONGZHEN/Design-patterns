package com.deng;

import java.util.Iterator;

/**
 * @Classname ListVisitor
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/26 12:00
 * @Created by helloDeng
 */
public class ListVisitor extends Visitor{
    private String currentDir = "";
    @Override
    public void visit(File file) {
        System.out.println(currentDir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory);
        String saveDir  = currentDir;
        currentDir = currentDir + "/" + directory.getName();
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()){
            Entry next = (Entry) iterator.next();
            next.accept(this);
        }
        currentDir = saveDir;
    }
}
