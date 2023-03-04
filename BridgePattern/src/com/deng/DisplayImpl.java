package com.deng;

/**
 * @Classname DisplayImpl
 * @Description      负责"显示"的类 ，位于类的实现层次结构的最上层
 * @Version 1.0.0
 * @Date 2023/2/19 19:19
 * @Created by helloDeng
 */
public abstract class DisplayImpl {
    public abstract void rawOpen();            //显示前处理
    public abstract void rawPrint();            //显示处理
    public abstract void rawClose();          //显示后处理

}
