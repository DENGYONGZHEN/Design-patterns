package com.deng;

/**
 * @Classname LimitSupport
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/26 12:54
 * @Created by helloDeng
 */
public class LimitSupport extends Support{
    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if(trouble.getNumber() < limit){
            return true;
        }else {
            return false;
        }
    }
}
