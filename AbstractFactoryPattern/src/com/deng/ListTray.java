package com.deng;

import com.deng.factory.Item;
import com.deng.factory.Tray;

import java.util.Iterator;

/**
 * @Classname ListTray
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/16 22:49
 * @Created by helloDeng
 */
public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption + "\n");
        buffer.append("<ul>\n");
        Iterator iterator = tray.iterator();
        while (iterator.hasNext()){
            Item item = (Item) iterator.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        return buffer.toString();
    }
}
