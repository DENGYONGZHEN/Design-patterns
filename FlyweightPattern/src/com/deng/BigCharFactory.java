package com.deng;

import java.util.HashMap;

/**
 * @Classname BigCharFactory
 * @Description    表示生成和共用BigChar类的实例 的类
 * @Version 1.0.0
 * @Date 2023/2/27 18:32
 * @Created by helloDeng
 */
public class BigCharFactory {

    private HashMap pool  = new HashMap();

    private static BigCharFactory singleton = new BigCharFactory();
    private BigCharFactory(){}

    public static BigCharFactory getSingleton() {
        return singleton;
    }

    /**
     * Flyweight模式的核心方法   共享实例
     * @param charname
     * @return
     */
    public synchronized BigChar getBigChar(char charname){
        BigChar bigChar = (BigChar) pool.get("" + charname);
        if(bigChar == null){
            bigChar = new BigChar(charname);           //根据需要生成BigChar的实例
            pool.put("" +charname,bigChar);            //保存BigChar的实例
        }
        return bigChar;
    }
}
