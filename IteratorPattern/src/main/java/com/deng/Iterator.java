package com.deng;

/**
 * @Classname Iterator   迭代器  和 Aggregate相对应
 * @Description          实现这个接口的可以是各种各样的迭代器，如从后向前遍历，跳跃遍历等等
 * @Version 1.0.0
 * @Date 2023/2/12 11:53
 * @Created by helloDeng
 */
public interface Iterator {
    public boolean hasNext();
    //返回当前元素并指向下一个元素
    public Object next();
}
