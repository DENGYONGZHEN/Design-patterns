package com.deng.game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @Classname Gamer
 * @Description   表示游戏主人公的类。他会生成Memento的实例
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

    private String getFruit() {               //获得一个水果
        String prefix = "";
        if(random.nextBoolean()){
            prefix = "好吃的";
        }
        return prefix + fruitsname[random.nextInt(fruitsname.length)];
    }

    public Memento createMemento(){          //拍摄快照
        Memento m = new Memento(money);
        Iterator iterator = fruits.iterator();
        while (iterator.hasNext()){
            String next = (String) iterator.next();
            if(next.startsWith("好吃的")){        //只保存好吃的水果
                m.addFruits(next);
            }
        }
        return m;
    }
    public void restoreMemento(Memento memento){    //撤销
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }

    @Override
    public String toString() {                    //表示主人公状态
        return "Gamer{" +
                "money=" + money +
                ", fruits=" + fruits +
                '}';
    }
}
