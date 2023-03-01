package com.deng;

/**
 * @Classname Trouble
 * @Description   表示发生问题的类。带有问题编号（number）
 * @Version 1.0.0
 * @Date 2023/2/26 12:43
 * @Created by helloDeng
 */
public class Trouble {
    private int number;

    public Trouble(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Trouble{" +
                "number=" + number +
                '}';
    }
}
