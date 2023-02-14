package com.deng;

/**
 * @Classname StringDisplay
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/13 20:12
 * @Created by helloDeng
 */
public class StringDisplay extends AbstractDisplay{
    private String str;
    private int width;

    public StringDisplay(String str) {
        this.str = str;
        this.width = str.getBytes().length;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + str + "|");
    }

    @Override
    public void close() {
        printLine();
    }
    public void printLine(){
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
