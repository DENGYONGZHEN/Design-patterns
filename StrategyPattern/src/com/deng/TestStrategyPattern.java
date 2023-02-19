package com.deng;

import java.util.Scanner;

/**
 * @Classname TestStrategyPattern
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/19 20:07
 * @Created by helloDeng
 *
 * StrategyPattern 整体替换算法
 * Strategy接口负责决定实现策略所必须的api
 * WinningStrategy、ProbStrategy负责实现Strategy中所定义的api
 * Player中保存了具体策略的实例，并调用相应的api实现需求
 */
public class TestStrategyPattern {
    public static void main(String[] args) {
        Player talor = new Player("talor", new WinningStrategy(50));
        Player lucy = new Player("lucy", new ProbStrategy(100));
        for (int i = 0; i < 1000; i++) {
            Hand hand1 = talor.nextHand();
            Hand hand2 = lucy.nextHand();
            if(hand1.isStrongerThan(hand2)){
                System.out.println("winner:" + talor);
                talor.win();
                lucy.lose();
            } else if (hand2.isStrongerThan(hand1)) {
                System.out.println("winner:" + lucy);
                talor.lose();
                lucy.win();
            }else {
                System.out.println("even");
                talor.even();
                lucy.even();
            }
        }
        System.out.println("total result:");
        System.out.println(talor.toString());
        System.out.println(lucy.toString());
    }
}
