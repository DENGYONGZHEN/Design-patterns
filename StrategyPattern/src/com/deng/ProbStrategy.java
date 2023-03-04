package com.deng;

import java.util.Random;

/**
 * @Classname ProbStrategy
 * @Description           表示”根据上一局的手势从概率上计算出下一局的手势
 *                          从之前的猜拳结果计算下一局出各种拳的概率“这一策略的类
 * @Version 1.0.0
 * @Date 2023/2/19 20:48
 * @Created by helloDeng
 */
public class ProbStrategy implements Strategy{
    private Random random;          //生成随机数的实例
    private int prevHandValue = 0;     //保存上一局的手势的值
    private int currentHandValue = 0;   //保存当前手势的值

    /**
     * 比如 x = history[0][1]   二维数组下标0表示在前一局出石头，下标1后一句出剪刀 所对应的赢的场次x
     */
    private int[][] history = {         //表示前后两次出的手势组合赢的次数
            {1,1,1},{1,1,1},{1,1,1}
    };

    public ProbStrategy(int seed) {
        this.random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        int bet = random.nextInt(getSum(currentHandValue));  //当前手势值的情况下获取总共赢的场数，作为条件生成随机数
        int handValue = 0;
        if(bet < history[currentHandValue][0]){       //随机数在小于history[currentHandValue][0]时出石头
            handValue = 0;
        } else if (bet <history[currentHandValue][0] + history[currentHandValue][1]) {
            handValue = 1;                           //按比例分配，满足当前条件，出剪刀
        }else {
            handValue = 2;                     //出布
        }
        prevHandValue = currentHandValue;           //当前手势的值保存到上一局的字段中
        currentHandValue = handValue;              //决定好的下一局的手势值保存到当前手势值字段中
        return Hand.getHand(handValue);            //返回手势实例
    }

    private int getSum(int hv) {           //传入当前手势值，获取在当前手势值的情况下，总共赢的场数
        int sum = 0;
        for (int i = 0; i < 3; i++) {      //例如当前手势值为2时，sum = history[2][0]+history[2][1]+history[2][2]
            sum += history[hv][i];
        }
        return sum;
    }

    @Override
    public void study(boolean win) {
        if(win){                                     //如果赢了
            history[prevHandValue][currentHandValue]++;
        }else {
            history[prevHandValue][(currentHandValue + 1) %3]++;
            history[prevHandValue][(currentHandValue + 2) %3]++;
        }
    }
}
