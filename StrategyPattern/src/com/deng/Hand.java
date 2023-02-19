package com.deng;

/**
 * @Classname Hand
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/19 20:23
 * @Created by helloDeng
 */
public class Hand {
    public static final int HAND_VALUE_GUU=0;
    public static final int HAND_VALUE_CHO=1;
    public static final int HAND_VALUE_PAA=2;
    public static final Hand[] hand = {
            new Hand(HAND_VALUE_GUU),
            new Hand(HAND_VALUE_CHO),
            new Hand(HAND_VALUE_PAA)
    };
    public static final String[] name={"石头","剪刀","布"};
    private int handValue;
    private Hand(int handValue) {
        this.handValue = handValue;
    }
    public static Hand getHand(int handValue){
        return hand[handValue];
    }
    public boolean isStrongerThan(Hand h){
        return fignt(h) == 1;
    }
    public boolean isWeakThan(Hand h){
        return fignt(h) == -1;
    }
    private int fignt(Hand h) {
        if(this == h){
            return 0;
        } else if ((this.handValue +1) % 3 == h.handValue) {
            return 1;
        }else {
            return -1;
        }
    }
    @Override
    public String toString() {
        return name[handValue];
    }
}
