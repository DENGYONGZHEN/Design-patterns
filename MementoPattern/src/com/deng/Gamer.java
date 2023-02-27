package com.deng;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @Classname Gamer
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/26 19:33
 * @Created by helloDeng
 */
public class Gamer {
    private int money;
    private List fruits = new ArrayList();
    private Random random = new Random();
    private static String[] fruitsname = {"苹果","香蕉","葡萄","橘子"};

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }
    public void bet(){
        int dice = random.nextInt(6) + 1;
        if(dice == 1){
            money += 100;
            System.out.println("所持金钱增加了");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("所持金钱减半了");
        } else if (dice == 6) {
            String f = getFruit();
            System.out.println("获得水果(" + f +")");
            fruits.add(f);
        }else {
            System.out.println("什么都没有发生");
        }
    }

    private String getFruit() {
        String prefix = "";
        if(random.nextBoolean()){
            prefix = "好吃的";
        }
        return prefix + fruitsname[random.nextInt(fruitsname.length)];
    }

    public Memento createMemento(){
        Memento m = new Memento(money);
        Iterator iterator = fruits.iterator();
        while (iterator.hasNext()){
            String next = (String) iterator.next();
            if(next.startsWith("好吃的")){
                m.addFruits(next);
            }
        }
        return m;
    }
    public void restoreMemento(Memento memento){
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "money=" + money +
                ", fruits=" + fruits +
                '}';
    }
}