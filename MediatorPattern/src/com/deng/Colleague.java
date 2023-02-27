package com.deng;

/**
 * @Classname Colleague
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/26 15:57
 * @Created by helloDeng
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
