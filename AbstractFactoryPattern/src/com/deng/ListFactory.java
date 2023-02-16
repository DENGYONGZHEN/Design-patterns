package com.deng;

import com.deng.factory.Factory;
import com.deng.factory.Link;
import com.deng.factory.Page;
import com.deng.factory.Tray;

/**
 * @Classname ListFactory
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/16 19:22
 * @Created by helloDeng
 */
public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption,url);
    }

    @Override
    public Tray createTray(String caption) {

        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title,author);
    }
}
