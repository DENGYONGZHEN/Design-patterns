package com.deng;

/**
 * @Classname CountDisplay
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/19 19:22
 * @Created by helloDeng
 */
public class CountDisplay extends Display{

    public CountDisplay(DisplayImpl imp) {
        super(imp);
    }
    public void multiDisplay(int times){
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }

}
