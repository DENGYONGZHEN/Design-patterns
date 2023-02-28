package com.deng;

/**
 * @Classname DayState
 * @Description    表示"白天"的状态的类
 * @Version 1.0.0
 * @Date 2023/2/27 16:49
 * @Created by helloDeng
 */
public class DayState implements State{
    private static DayState singleton = new DayState();
    private DayState(){}

    public static State getSingleton() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if(hour < 9 || 17 <= hour){
            context.changeState(NightState.getSingleton());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("使用金库（白天）");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃（白天）");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("正常通话（白天）");
    }

    @Override
    public String toString() {
        return "【白天】";
    }
}
