package com.deng;

import com.deng.factory.Link;

/**
 * @Classname ListLink
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/16 19:49
 * @Created by helloDeng
 */
public class ListLink extends Link {


    public ListLink(String caption, String url) {
        super(caption,url);
    }

    @Override
    public String makeHTML() {
        return "<li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
