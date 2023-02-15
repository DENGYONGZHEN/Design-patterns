package com.deng.practice;



/**
 * @Classname MessageBox
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/15 15:44
 * @Created by helloDeng
 */
public class MessageBox extends Product {
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }
    @Override
    public void use(String str){
        int length = str.getBytes().length;
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
        System.out.println(decochar + " " + str + " " + decochar);
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
    }
}
