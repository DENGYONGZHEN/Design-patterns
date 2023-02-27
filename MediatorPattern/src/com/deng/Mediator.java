package com.deng;

/**
 * @Classname Mediator
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/26 15:22
 * @Created by helloDeng
 */
public abstract class Mediator {
    public abstract void send(String message,Colleague colleague);
}
