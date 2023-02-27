package com.deng;

/**
 * @Classname NoSupport
 * @Description
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
    }
}
