package com.deng;

/**
 * @Classname TestObserverPattern
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/26 16:40
 * @Created by helloDeng
 */
public class TestObserverPattern {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer digitObserver = new DigitObserver();
        Observer graphObserver = new GraphObserver();
        generator.addObserver(digitObserver);
        generator.addObserver(graphObserver);
        generator.execute();
    }
}
