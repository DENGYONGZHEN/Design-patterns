package com.deng;

import java.util.Random;

/**
 * @Classname WinningStrategy
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/19 20:40
 * @Created by helloDeng
 */
public class WinningStrategy implements Strategy{
    private Random random;
    private boolean won=false;
    private Hand prevHand;

    public WinningStrategy(int seed) {
        this.random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if(!won){
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
