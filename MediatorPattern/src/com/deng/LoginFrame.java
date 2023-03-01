package com.deng;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;

/**
 * @Classname LoginFrame
 * @Description   表示登录对话框的类
 * @Version 1.0.0
 * @Date 2023/3/1 14:00
 * @Created by helloDeng
 */
public class LoginFrame extends Frame implements ActionListener,Mediator{

    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;
    private ColleagueButton buttonOk;
    private ColleagueButton buttonCancel;


    //构造函数
    //生成并配置各个Colleague后，显示对话框
    public LoginFrame(String title){
        super(title);
        setBackground(Color.lightGray);
        setLayout(new GridLayout(4,2));      //使用布局管理器生成4*2窗格
        createColleague();      //生成各个Colleague
        add(checkGuest);
        add(checkLogin);
        add(new Label("Username:"));
        add(textUser);
        add(new Label("Password:"));
        add(textPass);
        add(buttonOk);
        add(buttonCancel);
        colleagueChanged();        //设置初始的启用/禁用状态
        pack();                  //显示
        show();
    }


    public void createColleague() {     //生成各个Colleague

        CheckboxGroup group = new CheckboxGroup();
        checkGuest = new ColleagueCheckbox("Guest", group, true);
        checkLogin = new ColleagueCheckbox("Login",group,false);
        textUser = new ColleagueTextField("",10);
        textPass = new ColleagueTextField("",10);
        textPass.setEchoChar('*');
        buttonOk = new ColleagueButton("Ok");
        buttonCancel = new ColleagueButton("Cancel");
        //设置Mediator
        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);
        //设置Listener
        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        buttonOk.addActionListener(this);
        buttonCancel.addActionListener(this);
    }
    public void colleagueChanged() {     //接收来自Colleague的通知然后判断各Colleague的启用/禁用状态

        if(checkGuest.getState()){
            textUser.setColleagueEnabled(false);
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(true);
        }else {
            textUser.setColleagueEnabled(true);
            userpassChanged();
        }
    }

    //当textUser或textPass文本输入框中的文字发生变化时
    //判断各Colleague的启用/禁用状态
    private void userpassChanged() {

        if(textUser.getText().length() > 0 ){
            textPass.setColleagueEnabled(true);
            if(textPass.getText().length() > 0){
                buttonOk.setColleagueEnabled(true);
            }else {
                buttonOk.setColleagueEnabled(false);
            }
        }else {
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }
}
