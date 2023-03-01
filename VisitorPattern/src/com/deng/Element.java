package com.deng;

/**
 * @Classname Element
 * @Description        表示数据结构的接口，接收访问者的访问
 * @Version 1.0.0
 * @Date 2023/2/26 11:54
 * @Created by helloDeng
 */
public interface Element {
    public void accept(Visitor v);
}
