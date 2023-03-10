package com.deng;

/**
 * @Classname GraphObserver
 * @Description      表示以简单的图形形式显示数值的类
 * @Version 1.0.0
 * @Date 2023/2/26 16:55
 * @Created by helloDeng
 */
public class GraphObserver implements Observer{
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("GraphObserver :");
        int number = generator.getNumber();
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
