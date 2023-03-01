package com.deng;

/**
 * @Classname File
 * @Description        表示文件的类
 * @Version 1.0.0
 * @Date 2023/2/20 15:55
 * @Created by helloDeng
 */
public class File extends Entry{
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }


    @Override
    public void accept(Visitor v) {         //被访问者接收访问
        v.visit(this);
    }
}
