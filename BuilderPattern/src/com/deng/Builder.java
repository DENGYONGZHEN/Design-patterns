package com.deng;

/**
 * @Classname Builder
 * @Description          定义了决定文档结构的方法的抽象类
 * @Version 1.0.0
 * @Date 2023/2/16 16:47
 * @Created by helloDeng
 */
public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();        //完成文档编写
}
