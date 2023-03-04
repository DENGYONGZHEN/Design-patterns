package com.deng;

/**
 * @Classname MessageBox
 * @Description      将字符串放入方框中并使其显示出来的类。实现了use方法和createClone方法
 * @Version 1.0.0
 * @Date 2023/2/15 15:44
 * @Created by helloDeng
 */
public class MessageBox implements Product {
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }
    @Override
    public void use(String str){
        int length = str.getBytes().length;
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
        System.out.println(decochar + " " + str + " " + decochar);
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
    }

    /**
     * 在继承了Cloneable的类中调用clone方法，会复制一个一样的实例
     * @return
     */
    @Override
    public Product creatClone(){
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return p;
    }
}
