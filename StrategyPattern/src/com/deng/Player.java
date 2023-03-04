package com.deng;

/**
 * @Classname Player
 * @Description         表示猜拳游戏的选手的类
 * @Version 1.0.0
 * @Date 2023/2/19 21:28
 * @Created by helloDeng
 */
public class Player {
    private String name;          //猜拳选手名
    private Strategy strategy;         //策略
    private int wincount;        //赢的场次
    private int losecount;        //输的场次
    private int gamecount;        //总的游戏场次

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }
    public Hand nextHand(){
        return strategy.nextHand();
    }
    public void win(){
        strategy.study(true);                     //胜
        wincount++;
        gamecount++;
    }
    public void lose(){
        strategy.study(false);                  //负
        losecount++;
        gamecount++;
    }
    public void even(){
        gamecount++;
    }             //平

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", wincount=" + wincount +
                ", losecount=" + losecount +
                ", gamecount=" + gamecount +
                '}';
    }
}
