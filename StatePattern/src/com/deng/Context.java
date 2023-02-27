package com.deng;

/**
 * @Classname Context
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/27 16:45
 * @Created by helloDeng
 */
public interface Context {

    public void changeState(State state);   //改变状态
    public void setClock(int hour);        //设置时间
    public void callSecurityCenter(String msg);  //联系警报中心
    public void recordLog(String msg);    //在警报中心留下记录
}
