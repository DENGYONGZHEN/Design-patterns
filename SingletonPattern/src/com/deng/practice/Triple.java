package com.deng.practice;

/**
 * @Classname Triple
 * @Description 最多智能生成3个实例，实力编号分别为0，1，2且可以通过getInstance（int id） 获取编号对应的实例
 * @Version 1.0.0
 * @Date 2023/2/15 14:56
 * @Created by helloDeng
 */
public class Triple {
    private int id ;
    private static Triple[] triples = {new Triple(0),new Triple(1),new Triple(2)};

    private Triple(int id){
        this.id = id;
    }
    public static Triple getInstance(int id){
        return triples[id];
    }

}
