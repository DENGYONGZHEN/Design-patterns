package com.deng;

/**
 * @Classname Observer
 * @Description  表示观察者的接口
 * @Version 1.0.0
 * @Date 2023/2/26 16:40
 * @Created by helloDeng
 */
public interface Observer {
    public abstract void update(NumberGenerator generator);
}
