package com.deng;

/**
 * @Classname Printable
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/27 18:54
 * @Created by helloDeng
 */
public interface Printable {
    public abstract void setPrinterName(String name); //设置名字
    public abstract String getPrinterName();          //获取名字
    public abstract void print(String string);        //显示文字
}
