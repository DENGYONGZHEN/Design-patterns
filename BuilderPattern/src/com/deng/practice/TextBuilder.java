package com.deng.practice;

/**
 * @Classname TextBuilder
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/16 16:56
 * @Created by helloDeng
 */
public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();
    @Override
    public void doTitle(String title) {
        buffer.append("=======================\n");
        buffer.append("『" + title +"』\n");
        buffer.append("\n");
    }

    @Override
    public void doString(String str) {
        buffer.append("@" + str +"\n");
        buffer.append("\n");
    }

    @Override
    public void doItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            buffer.append("  *" + items[i] +"\n");
        }
        buffer.append("\n");
    }

    @Override
    public void doclose() {
        buffer.append("=======================\n");
    }
    public String getResult(){
        return buffer.toString();
    }
}
