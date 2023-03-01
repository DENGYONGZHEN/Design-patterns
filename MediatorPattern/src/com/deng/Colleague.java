package com.deng;

/**
 * @Classname Colleague
 * @Description   定义"组员"的接口(API)的接口
 * @Version 1.0.0
 * @Date 2023/3/1 13:55
 * @Created by helloDeng
 */
public interface Colleague {
    public void setMediator(Mediator mediator);       //通知组员谁是Mediator
    public void setColleagueEnabled(boolean enabled);  //Mediator向组员下达的指示
}
