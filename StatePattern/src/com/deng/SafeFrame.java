package com.deng;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Classname SafeFrame
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/27 17:09
 * @Created by helloDeng
 */
public class SafeFrame extends Frame implements ActionListener,Context {
    private TextField textClock = new TextField(60);   //显示当前时间
    private TextArea textScreen = new TextArea(10,60);
    private Button buttonUse = new Button("使用金库");
    private Button buttonAlarm = new Button("按下警铃");
    private Button buttonPhone = new Button("正常通话");
    private Button buttonExit = new Button("结束");

    private State state = DayState.getSingleton();

    public SafeFrame(String title){
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        //配置textClock
        add(textClock,BorderLayout.NORTH);
        textClock.setEditable(false);
        //配置textScreen
        add(textScreen,BorderLayout.CENTER);
        textScreen.setEditable(false);
        //为界面添加按钮
        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);
        //配置界面
        add(panel,BorderLayout.SOUTH);
        //显示
        pack();
        show();
        //设置监听器
        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
    }

    //按钮按下后该方法会被调用
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        if(e.getSource() == buttonUse){
            state.doUse(this);
        } else if (e.getSource() == buttonAlarm) {
            state.doAlarm(this);
        } else if (e.getSource() == buttonPhone) {
            state.doPhone(this);
        }else if(e.getSource() == buttonExit){
            System.exit(0);
        }else {
            System.out.println("?");
        }
    }
    @Override
    public void changeState(State state) {
        System.out.println("从" + this.state + "状态变为了" + state + "状态");
        this.state = state;
    }

    //设置时间
    @Override
    public void setClock(int hour) {
        String cloclstring = "现在时间是";
        if(hour < 10){
            cloclstring += "0" + hour + ":00";
        }else {
            cloclstring +=  hour + ":00";
        }
        System.out.println(cloclstring);
        textClock.setText(cloclstring);
        state.doClock(this,hour);
    }

    @Override
    public void callSecurityCenter(String msg) {
        textScreen.append("call!" + msg +"\n");
    }

    @Override
    public void recordLog(String msg) {
        textScreen.append("record..." + msg + "\n");
    }



}
