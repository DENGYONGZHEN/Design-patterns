package com.deng.listFactory;

import com.deng.factory.Item;
import com.deng.factory.Tray;

import java.util.Iterator;

/**
 * @Classname ListTray
 * @Description   具体零件：表示含有Link和Tray的类
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
            Item item = (Item) iterator.next();      //不关心实际是ListLink或ListTray类型，运行时决定
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        return buffer.toString();
    }
}
