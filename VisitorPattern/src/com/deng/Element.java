package com.deng;

/**
 * @Classname Element
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/26 11:54
 * @Created by helloDeng
 */
public interface Element {
    public void accept(Visitor v);
}
