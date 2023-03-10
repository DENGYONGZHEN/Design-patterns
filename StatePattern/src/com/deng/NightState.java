package com.deng;

/**
 * @Classname NightState
 * @Description    表示"晚上"的状态的类
 * @Version 1.0.0
 * @Date 2023/2/27 16:54
 * @Created by helloDeng
 */
public class NightState implements State{

    private static NightState singleton = new NightState();
    private NightState(){}

    public static State getSingleton() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {       //设置时间
        if(9 <= hour && hour <17){
            context.changeState(DayState.getSingleton());
        }
    }

    @Override
    public void doUse(Context context) {                   //使用金库
        context.callSecurityCenter("紧急：晚上使用金库！");
    }

    @Override
    public void doAlarm(Context context) {               //按下警铃
        context.callSecurityCenter("按下警铃（晚上）");
    }

    @Override
    public void doPhone(Context context) {           //正常通话
        context.recordLog("晚上的通话录音");
    }

    @Override
    public String toString() {
        return "【晚上】";
    }
}
