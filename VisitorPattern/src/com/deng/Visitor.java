package com.deng;



/**
 * @Classname Visitor
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/26 11:43
 * @Created by helloDeng
 */
public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
