package com.deng;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

/**
 * @Classname BigChar
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/27 18:25
 * @Created by helloDeng
 */
public class BigChar {
    private char charname;
    //大型字符对应的字符串
    private String fontdata;

    public BigChar(char charname) {
        this.charname = charname;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("big" + charname + ".text"));
            String line;
            StringBuffer buffer = new StringBuffer();
            while ((line = reader.readLine()) != null){
                buffer.append(line);
                buffer.append("\n");
            }
            reader.close();
            this.fontdata  = buffer.toString();
        } catch (IOException e) {
            this.fontdata = charname + "?";
        }
    }
    //显示大型字符
    public void print(){
        System.out.println(fontdata);
    }
}
