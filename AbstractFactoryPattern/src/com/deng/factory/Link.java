package com.deng.factory;

/**
 * @Classname Link
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/16 19:25
 * @Created by helloDeng
 */
public abstract class Link extends Item{
    protected String url;
    public Link(String caption,String url) {
        super(caption);
        this.url = url;
    }
}
