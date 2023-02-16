package com.deng.practice;

/**
 * @Classname Builder
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/16 16:47
 * @Created by helloDeng
 */
public abstract class Builder {
    public static boolean initialized = false;
    public  void makeTitle(String title){
        if(!initialized){
            doTitle(title);
            initialized = true;
        }
    };
    public  void makeString(String str){
        if(initialized){
            doString(str);
        }
    };
    public  void makeItems(String[] items){
        if(initialized){
            doItems(items);
        }
    };
    public  void close(){
        if(initialized){
            doclose();
        }
    };

    protected abstract void doTitle(String title);
    protected abstract void doString(String str);
    protected abstract void doItems(String[] items);
    protected abstract void doclose();
}
