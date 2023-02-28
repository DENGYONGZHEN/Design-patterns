package com.deng;



/**
 * @Classname ProgramNode
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/27 20:56
 * @Created by helloDeng
 *
 * <program>::=program <command list>  定义了一个程序，以program开始，program作为标记
 */
public class ProgramNode extends Node{
    private Node commandListNode;  //保存 <command list>对应的结构
    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("program");   //跳过program标记
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    //连接实例和字符串时，会自动调用实例的toString方法
    @Override
    public String toString() {
        return "[program" + commandListNode + "]";
    }
}
