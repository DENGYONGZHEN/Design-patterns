package com.deng.simpleFactoryPattern;

/**
 * @Classname ClamPizza
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/22 22:42
 * @Created by helloDeng
 */
public class ClamPizza extends Pizza {
    @Override
    public void prepare() {
        setName("clam");
        System.out.println(name + ":perparing");
    }
}
