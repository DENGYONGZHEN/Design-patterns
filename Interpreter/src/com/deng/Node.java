package com.deng;



/**
 * @Classname Node
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/27 20:54
 * @Created by helloDeng
 *
 * 语法树中各个部分（节点）中最顶层的类
 */
public abstract class Node {
    /**
     * 语法解析处理
     * @param context 语法解析上下文
     * @throws ParseException
     */
    public abstract void parse(Context context) throws ParseException;
}
