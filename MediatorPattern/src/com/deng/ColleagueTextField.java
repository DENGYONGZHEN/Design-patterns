package com.deng;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 * @Classname ColleagueTextField
 * @Description  表示文本输入框的类
 * @Version 1.0.0
 * @Date 2023/3/1 13:57
 * @Created by helloDeng
 */
public class ColleagueTextField extends TextField implements TextListener, Colleague{
    private Mediator mediator;

    public ColleagueTextField(String text,int columns) {
        super(text,columns);
    }


    @Override
    public void setMediator(Mediator mediator) {  //保存Mediator
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {  //Mediator下达启用/禁用的指示
        setEnabled(enabled);
        setBackground(enabled?Color.white:Color.lightGray);
    }

    @Override
    public void textValueChanged(TextEvent e) {         //当文字发生变化时通知Mediator
        mediator.colleagueChanged();
    }
}
