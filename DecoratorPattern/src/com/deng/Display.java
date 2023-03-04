package com.deng;

/**
 * @Classname Display
 * @Description       用于显示字符串的抽象类
 * @Version 1.0.0
 * @Date 2023/2/20 21:04
 * @Created by helloDeng
 */
public abstract class Display {
    public abstract int getColumns();         //获取横向字符数
    public abstract int getRows();           //获取纵向行数
    public abstract String getRowText(int row);       //获取第row行的字符串
    public final void show(){
        for (int i = 0; i < getRows(); i++) {         //全部显示，template method模式
            System.out.println(getRowText(i));
        }
    }
}
