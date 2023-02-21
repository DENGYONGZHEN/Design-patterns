package com.deng;

/**
 * @Classname StringDisplay
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/20 21:09
 * @Created by helloDeng
 */
public class StringDisplay extends Display{
    private String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public int getColumns() {
        return string.getBytes().length;
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        if(row == 0){
            return string;
        }else {
            return null;
        }
    }
}
