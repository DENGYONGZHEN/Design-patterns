package com.deng;

/**
 * @Classname UnderLinePen
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/15 20:15
 * @Created by helloDeng
 */
public class UnderLinePen implements Product {

    private char ulchar;

    public UnderLinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        System.out.print(" ");
        for (int i = 0; i < length; i++) {
            System.out.print(ulchar);
        }
        System.out.println("");

    }

    @Override
    public Product creatClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return p;
    }
}
