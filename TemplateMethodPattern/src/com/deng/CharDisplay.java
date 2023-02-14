package com.deng;

/**
 * @Classname CharDisplay
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/13 20:10
 * @Created by helloDeng
 */
public class CharDisplay extends AbstractDisplay{
    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
