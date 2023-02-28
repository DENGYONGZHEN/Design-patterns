package com.deng;



/**
 * @Classname State
 * @Description    表示金库状态的接口
 * @Version 1.0.0
 * @Date 2023/2/27 16:44
 * @Created by helloDeng
 */
public interface State {
    public abstract void doClock(Context context,int hour);  //设置时间
    public abstract void doUse(Context context);    //使用金库
    public abstract void doAlarm(Context context);  //按下警铃
    public abstract void doPhone(Context context);  //正常通话
}
