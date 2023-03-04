package com.deng;

/**
 * @Classname File
 * @Description    表示文件的类
 * @Version 1.0.0
 * @Date 2023/2/20 15:55
 * @Created by helloDeng
 */
public class File extends Entry{
    private String name;                //文件名
    private int size;                   //文件大小

    public File(String name, int size) {           //构造函数
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
    protected void printList(String prefix){
        System.out.println(prefix +"/" + this);
    }

}
