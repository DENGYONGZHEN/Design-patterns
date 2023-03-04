package com.deng;

/**
 * @Classname SideBorder
 * @Description   用于只显示左右边框的类
 * @Version 1.0.0
 * @Date 2023/2/20 21:14
 * @Created by helloDeng
 */
public class SideBorder extends Border{
    private char borderChar;                //表示装饰边框的字符
    protected SideBorder(Display display,char ch) {
        super(display);
        this.borderChar = ch;
    }

    @Override
    public int getColumns() {//字符数为字符串字符数加上两侧边框字符数

        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }   //行数即被装饰物的行数

    @Override
    public String getRowText(int row) {   //指定的那一行的字符串为被装饰物的字符串加上两侧的边框的字符

        return borderChar + display.getRowText(row) + borderChar;
    }
}
