package com.deng;

/**
 * @Classname Border
 * @Description  用于显示装饰边框的抽象类
 * @Version 1.0.0
 * @Date 2023/2/20 21:13
 * @Created by helloDeng
 */
public abstract class Border extends Display{          //通过继承，装饰边框与被装饰物具有了相同的方法
    protected Display display;  //表示被装饰物，字符串是被装饰物，边框也可能是被装饰物
    protected Border(Display display){
        this.display = display;
    }
}
