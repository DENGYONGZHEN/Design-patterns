package com.deng;

/**
 * @Classname Display
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/20 21:04
 * @Created by helloDeng
 */
public abstract class Display {
    public abstract int getColumns();
    public abstract int getRows();
    public abstract String getRowText(int row);
    public final void show(){
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
