package com.deng;


import java.util.Random;

/**
 * @Classname RandomNumberGenerator
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/26 16:48
 * @Created by helloDeng
 */
public class RandomNumberGenerator extends NumberGenerator{

    private Random random = new Random();
    private int number;

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}
