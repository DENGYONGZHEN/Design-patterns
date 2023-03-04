package com.deng;

/**
 * @Classname Hand
 * @Description   表示猜拳游戏中的"手势"的类
 * @Version 1.0.0
 * @Date 2023/2/19 20:23
 * @Created by helloDeng
 */
public class Hand {
    public static final int HAND_VALUE_GUU=0;     //石头
    public static final int HAND_VALUE_CHO=1;    //剪刀
    public static final int HAND_VALUE_PAA=2;    //布
    public static final Hand[] hand = {
            new Hand(HAND_VALUE_GUU),
            new Hand(HAND_VALUE_CHO),            //猜拳中三种手势的实例
            new Hand(HAND_VALUE_PAA)
    };
    public static final String[] name={"石头","剪刀","布"};      //手势对应的名字
    private int handValue;                //手势值
    private Hand(int handValue) {
        this.handValue = handValue;
    }
    public static Hand getHand(int handValue){          //根据手势值从数组中获取对应的手势实例
        return hand[handValue];
    }
    public boolean isStrongerThan(Hand h){        //当前手势赢传过来的h为true
        return fignt(h) == 1;
    }
    public boolean isWeakThan(Hand h){        //当前手势输传过来的h时为true
        return fignt(h) == -1;
    }
    private int fignt(Hand h) {
        if(this == h){             //平局
            return 0;
        } else if ((this.handValue +1) % 3 == h.handValue) {     //石头剪刀布时相克关系
            return 1;                    //即前一个总是大于紧接着的后一个，并且可能数为3
        }else {                    //输局
            return -1;
        }
    }
    @Override
    public String toString() {
        return name[handValue];
    }
}
