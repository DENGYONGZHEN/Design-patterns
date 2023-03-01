package com.deng;

/**
 * @Classname Mediator
 * @Description 定义"仲裁者"的接口（API）的接口
 * @Version 1.0.0
 * @Date 2023/3/1 13:54
 * @Created by helloDeng
 */
public interface Mediator {
    public void createColleague();      //生成Mediator要管理的组员
    public void colleagueChanged();     //会被各个Colleague组员调用，实现组员向Mediator报告
}
