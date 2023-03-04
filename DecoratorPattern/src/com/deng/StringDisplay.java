package com.deng;

/**
 * @Classname StringDisplay
 * @Description    用于显示单行字符串的类
 * @Version 1.0.0
 * @Date 2023/2/20 21:09
 * @Created by helloDeng
 */
public class StringDisplay extends Display{
    private String string;                   //要显示的字符串

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public int getColumns() {
        return string.getBytes().length;
    }    //字符数

    @Override
    public int getRows() {
        return 1;
    }             //行数为1

    @Override
    public String getRowText(int row) {             //仅当row为0时返回值
        if(row == 0){
            return string;
        }else {
            return null;
        }
    }
}
