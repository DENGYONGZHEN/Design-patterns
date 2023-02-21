package com.deng;

/**
 * @Classname Border
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/20 21:13
 * @Created by helloDeng
 */
public abstract class Border extends Display{
    protected Display display;
    protected Border(Display display){
        this.display = display;
    }
}
