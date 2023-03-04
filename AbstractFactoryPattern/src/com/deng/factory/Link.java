package com.deng.factory;

/**
 * @Classname Link
 * @Description     抽象零件：表示HTML的超链接的类
 * @Version 1.0.0
 * @Date 2023/2/16 19:25
 * @Created by helloDeng
 */
public abstract class Link extends Item{
    protected String url;            //超链接的地址
    public Link(String caption,String url) {
        super(caption);
        this.url = url;
    }
}
