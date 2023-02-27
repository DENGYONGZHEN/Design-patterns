package com.deng.simpleFactoryPattern;

/**
 * @Classname Pizza
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/22 22:37
 * @Created by helloDeng
 */
public abstract class Pizza {

    protected String name;
    public abstract void prepare();
    public void bake(){
        System.out.println(name + ":baking");
    };
    public void cut(){
        System.out.println(name + ":cutting");
    };
    public void box(){
        System.out.println(name + ":boxing");
    };

    public void setName(String name) {
        this.name = name;
    }
}
