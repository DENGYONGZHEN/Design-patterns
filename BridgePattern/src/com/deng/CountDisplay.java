package com.deng;

/**
 * @Classname CountDisplay
 * @Description     增加了"只显示规定次数"这一功能的类
 * @Version 1.0.0
 * @Date 2023/2/19 19:22
 * @Created by helloDeng
 */
public class CountDisplay extends Display{

    public CountDisplay(DisplayImpl imp) {
        super(imp);
    }
    public void multiDisplay(int times){            //循环显示times次
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }

}
