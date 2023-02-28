package com.deng;

/**
 * @Classname BigString
 * @Description   表示多个BigChar组成的"大型字符串"的类
 * @Version 1.0.0
 * @Date 2023/2/27 18:38
 * @Created by helloDeng
 */
public class BigString {
    private BigChar[] bigChars;
    public BigString(String string){
        bigChars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getSingleton();
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i] = factory.getBigChar(string.charAt(i));
        }
    }
    public void print(){
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i].print();
        }
    }
}
