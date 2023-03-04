package com.deng.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Page
 * @Description       抽象产品：表示HTML页面的类
 * @Version 1.0.0
 * @Date 2023/2/16 19:32
 * @Created by helloDeng
 */
public abstract class Page {
    protected String title;                 //页面标题
    protected String author;               //页面作者
    protected List content  = new ArrayList();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public void add(Item item){
        content.add(item);
    }     //向页面中增加item
    public void output(){
        String filename = title + ".html";
        try {
            Writer writer = new FileWriter(filename);
            writer.write(this.makeHTML());
            writer.close();
            System.out.println(filename + "编写完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public abstract String makeHTML();
}
