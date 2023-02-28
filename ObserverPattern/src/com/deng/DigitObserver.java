package com.deng;

/**
 * @Classname DigitObserver
 * @Description      表示以数字形式显示数值的类
 * @Version 1.0.0
 * @Date 2023/2/26 16:53
 * @Created by helloDeng
 */
public class DigitObserver implements Observer{
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver:" + generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
