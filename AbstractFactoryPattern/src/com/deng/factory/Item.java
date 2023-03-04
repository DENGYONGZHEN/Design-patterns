package com.deng.factory;

/**
 * @Classname Item
 * @Description     方便统一处理Link和Tray的类
 * @Version 1.0.0
 * @Date 2023/2/16 19:23
 * @Created by helloDeng
 */
public abstract class Item {
    protected String caption;       //标题

    public Item(String caption) {
        this.caption = caption;
    }
    public abstract String makeHTML();
}
