package com.deng;

import com.deng.factory.Item;
import com.deng.factory.Page;

import java.util.Iterator;

/**
 * @Classname ListPage
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/16 22:55
 * @Created by helloDeng
 */
public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title,author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>" + title + "</title></head></html>");
        buffer.append("<body>\n");
        buffer.append("<h1>" + title + "</h1>\n");
        buffer.append("<ul>\n");
        Iterator iterator = content.iterator();
        while(iterator.hasNext()){
            Item item = (Item) iterator.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address>" + author + "</address>");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}
