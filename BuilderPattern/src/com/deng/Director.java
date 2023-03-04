package com.deng;

/**
 * @Classname Director
 * @Description      编写一个文档的类
 * @Version 1.0.0
 * @Date 2023/2/16 16:50
 * @Created by helloDeng
 */
public class Director {
    private Builder builder;          //Builder类型的实例
    public Director(Builder builder){
        this.builder = builder;
    }
    public void construct(){             //编写文档的方法
        builder.makeTitle("Greeting");
        builder.makeString("从早上至下午");
        builder.makeItems(new String[]{
                "早上好。",
                "下午好。",
        });
        builder.makeString("晚上");
        builder.makeItems(new String[]{
                "晚上好。",
                "晚安。",
                "再见。",
        });
        builder.close();
    }
}
