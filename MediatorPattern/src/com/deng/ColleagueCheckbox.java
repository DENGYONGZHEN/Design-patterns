package com.deng;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * @Classname ColleagueCheckbox
 * @Description   表示勾选框（此处是单选按钮）的类
 * @Version 1.0.0
 * @Date 2023/3/1 13:58
 * @Created by helloDeng
 */
public class ColleagueCheckbox extends Checkbox implements ItemListener,Colleague{

    private Mediator mediator;

    public ColleagueCheckbox(String caption, CheckboxGroup group, boolean state){
        super(caption, group, state);
    }

    @Override
    public void setMediator(Mediator mediator) {       //保存mediator
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {  //mediator下达启用/禁用指示
        setEnabled(enabled);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {        //当状态发生变化时通知Mediator
        mediator.colleagueChanged();
    }
}
