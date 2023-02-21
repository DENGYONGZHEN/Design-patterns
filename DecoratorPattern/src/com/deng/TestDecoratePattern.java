package com.deng;

/**
 * @Classname TestDecoratePattern
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/20 21:03
 * @Created by helloDeng
 */
public class TestDecoratePattern {
    public static void main(String[] args) {
        Display d1= new StringDisplay("hello,world.");
        Display d2= new SideBorder(d1,'#');
        Display d3 = new FullBorder(d2);
        d1.show();
        d2.show();
        d3.show();
        Display d4 = new SideBorder(
                        new FullBorder(
                                new FullBorder(
                                        new SideBorder(
                                                new FullBorder(
                                                        new StringDisplay("你好，世界。")
                                                ),
                                                '*'
                                        )
                                )
                        ),'/'
        );
        d4.show();

    }

}
