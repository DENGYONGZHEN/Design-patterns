package com.deng;

/**
 * @Classname StringDisplayImpl
 * @Description "用字符串显示"的类        类的实现层次结构
 * @Version 1.0.0
 * @Date 2023/2/19 19:25
 * @Created by helloDeng
 */
public class StringDisplayImpl extends DisplayImpl{
    private String string;            //要显示的字符串
    private int width;               //以字节单位计算出的字符串的宽度

    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }
}
