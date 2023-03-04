package com.deng;

/**
 * @Classname FullBorder
 * @Description        用于显示上下左右边框的类
 * @Version 1.0.0
 * @Date 2023/2/20 21:18
 * @Created by helloDeng
 */
public class FullBorder extends Border{
    public FullBorder(Display display) {
        super(display);
    }

    //字符数为字符串字符数加上两侧边框字符数
    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    //行数为被装饰的行数加上上下边框的行数
    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {    //指定的那一行的字符串
        if(row == 0){                                               //下边框
            return "+" + makeLine('-',display.getColumns()) + "+";
        } else if (row == display.getRows() + 1) {                  //上边框
            return "+" + makeLine('-',display.getColumns()) + "+";
        }else {                                                     //其他边框
            return "|" + display.getRowText(row -1) + "|";
        }
    }

    private String makeLine(char c, int columns) { //生成一个重复count次字符ch的字符串
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < columns; i++) {
            buffer.append(c);
        }
        return buffer.toString();
    }
}
