package com.deng;

/**
 * @Classname Banner
 * @Description         Parentheses 圆括号
 * @Version 1.0.0        Asterisk   星号
 * @Date 2023/2/12 19:56
 * @Created by helloDeng
 */
public class Banner {
    private String name;
    public Banner(String name){
        this.name = name;
    }
    public void showWithParen(){
        System.out.println("(" + name + ")");
    }
    public void showWithAster(){
        System.out.println("*" + name + "*");
    }
}
