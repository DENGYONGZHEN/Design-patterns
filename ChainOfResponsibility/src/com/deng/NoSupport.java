package com.deng;

/**
 * @Classname NoSupport
 * @Description         用来解决问题的具体类（永远"不处理问题"）
 * @Version 1.0.0
 * @Date 2023/2/26 12:53
 * @Created by helloDeng
 */
public class NoSupport extends Support{

    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }    //解决问题的方法，什么也不处理
}
