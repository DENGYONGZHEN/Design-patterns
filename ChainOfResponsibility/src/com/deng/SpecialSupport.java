package com.deng;

/**
 * @Classname SpecialSupport
 * @Description    用来解决问题的具体类（仅解决指定编号的问题）
 * @Version 1.0.0
 * @Date 2023/2/26 13:30
 * @Created by helloDeng
 */
public class SpecialSupport extends Support{
    private int number;

    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if(trouble.getNumber() == number){
            return  true;
        }else {
            return false;
        }
    }
}
