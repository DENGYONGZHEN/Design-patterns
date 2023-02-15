package com.deng;

/**
 * @Classname Product
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/15 15:35
 * @Created by helloDeng
 *
 * Product是复制功能的接口，继承了Cloneable接口,定义了两个抽象方法，use和creatClone
 */
public interface Product extends Cloneable{
    public abstract void use(String s);
    public abstract Product creatClone();
}
