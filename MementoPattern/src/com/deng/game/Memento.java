package com.deng.game;

import java.util.ArrayList;
import java.util.List;


/**
 * @Classname Memento
 * @Description  表示Gamer状态的类
 * @Version 1.0.0
 * @Date 2023/2/26 18:52
 * @Created by helloDeng
 */
public class Memento {
    int money;
    ArrayList fruits;

    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList();
    }

    public int getMoney() {
        return money;
    }
    void addFruits(String fruit){
        fruits.add(fruit);
    }

    List getFruits() {
        return (List) fruits.clone();
    }
}
