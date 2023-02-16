package com.deng;

/**
 * @Classname Builder
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/16 16:47
 * @Created by helloDeng
 */
public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
}
