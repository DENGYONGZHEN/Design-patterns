package com.deng.practice;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Classname HTMLBuilder
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/16 17:06
 * @Created by helloDeng
 */
public class HTMLBuilder extends Builder {
    private String filename;
    private PrintWriter writer;
    @Override
    public void doTitle(String title) {
        filename = title + ".html";
        try {
             writer = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head></body>");
        writer.println("<h1>" + title + "</h1>");
    }

    @Override
    public void doString(String str) {
        writer.println("<p>" + str + "</p>");
    }

    @Override
    public void doItems(String[] items) {
        writer.println("<ul>");
        for (int i = 0; i < items.length; i++) {
            writer.println("<li>" + items[i] +"</li>");
        }
        writer.println("</ul>");
    }
    @Override
    public void doclose() {
        writer.println("</body></html>");
        writer.close();
    }
    public String getResult(){
        return filename;
    }
}
