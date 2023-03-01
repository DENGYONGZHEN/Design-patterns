package com.deng;



/**
 * @Classname Visitor
 * @Description         表示访问者的抽象类，访问文件和文件夹
 * @Version 1.0.0
 * @Date 2023/2/26 11:43
 * @Created by helloDeng
 */
public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
