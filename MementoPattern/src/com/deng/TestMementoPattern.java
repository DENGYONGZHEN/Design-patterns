package com.deng;

/**
 * @Classname TestMementoPattern
 * @Description 备忘录模式
 * @Version 1.0.0
 * @Date 2023/2/26 18:11
 * @Created by helloDeng
 * 备忘录模式:在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
 * 这样以后就可将该对象恢复到原先保存的状态
 *
 */
public class TestMementoPattern {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            System.out.println("====" + i);
            System.out.println("当前状态：" +gamer);
            gamer.bet();
            System.out.println("所持捡钱为"+gamer.getMoney() +"元");
            if(gamer.getMoney() > memento.getMoney()){
                System.out.println("    (所持捡钱增加了许多，因此保存游戏当前的状态)");
                gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney()) {
                System.out.println("    (所持捡钱减少了许多，因此将游戏恢复以前的状态)");
                gamer.restoreMemento(memento);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("");
        }
    }
}
