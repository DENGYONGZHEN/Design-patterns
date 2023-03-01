package com.deng;

import java.awt.*;

/**
 * @Classname ColleagueButton
 * @Description  表示按钮的类
 * @Version 1.0.0
 * @Date 2023/3/1 13:56
 * @Created by helloDeng
 */
public class ColleagueButton extends Button implements Colleague{
    private Mediator mediator;

    public ColleagueButton(String caption){
        super(caption);
    }

    @Override
    public void setMediator(Mediator mediator) {        //保存Mediator
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {   //Mediator下达启用/禁用的指示
        setEnabled(enabled);
    }
}
