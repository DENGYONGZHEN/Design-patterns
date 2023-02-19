package com.deng;

import java.util.Random;

/**
 * @Classname RandomCountDisplay
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/19 19:58
 * @Created by helloDeng
 */
public class RandomCountDisplay extends CountDisplay{

    public RandomCountDisplay(DisplayImpl imp) {
        super(imp);
    }
    public void randomDisplay(int times){
        open();
        Random random = new Random();
        int anInt = random.nextInt(times);
        for (int i = 0; i < anInt; i++) {
                print();
        }
        close();
    }
}
