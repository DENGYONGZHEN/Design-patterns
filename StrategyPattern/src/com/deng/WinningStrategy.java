package com.deng;

import java.util.Random;

/**
 * @Classname WinningStrategy
 * @Description    表示"如果这局猜拳获胜，那么下一局也出一样的手势"这一策略的类
 * @Version 1.0.0
 * @Date 2023/2/19 20:40
 * @Created by helloDeng
 */
public class WinningStrategy implements Strategy{
    private Random random;          //随机数生成器
    private boolean won=false;     //上一局猜拳输赢的结果
    private Hand prevHand;         //上一局的手势

    public WinningStrategy(int seed) {
        this.random = new Random(seed);
    }

    @Override
    public Hand nextHand() {        //获取下一次手势
        if(!won){                   //如果输了，获取一个随即手势
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;          //如果赢了，返回上一局的手势
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
