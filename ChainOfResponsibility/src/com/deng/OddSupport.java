package com.deng;

/**
 * @Classname OddSupport
 * @Description        用来解决问题的具体类（仅解决奇数编号的问题）
 * @Version 1.0.0
 * @Date 2023/2/26 13:28
 * @Created by helloDeng
 */
public class OddSupport extends Support{
    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if(trouble.getNumber() % 2 == 1 ){
            return true;
        }else {
            return false;
        }
    }
}
