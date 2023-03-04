package com.deng;

/**
 * @Classname Aggregate表示集合的接口  负责定义创建Iterator实例
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/12 11:50
 * @Created by helloDeng
 */
public interface Aggregate {
  public Iterator iterator();   //生成遍历集合的迭代器
}
