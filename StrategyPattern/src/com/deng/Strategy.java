package com.deng;

/**
 * @Classname Strategy
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/19 20:38
 * @Created by helloDeng
 */
public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
