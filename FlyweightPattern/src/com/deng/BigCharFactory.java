package com.deng;

import java.util.HashMap;

/**
 * @Classname BigCharFactory
 * @Description
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
    public synchronized BigChar getBigChar(char charname){
        BigChar bigChar = (BigChar) pool.get("" + charname);
        if(bigChar == null){
            bigChar = new BigChar(charname);
            pool.put("" +charname,bigChar);
        }
        return bigChar;
    }
}
