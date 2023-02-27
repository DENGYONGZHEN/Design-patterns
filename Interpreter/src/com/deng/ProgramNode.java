package com.deng;



/**
 * @Classname ProgramNode
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/27 20:56
 * @Created by helloDeng
 */
public class ProgramNode extends Node{
    private Node commandListNode;
    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("program");
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    @Override
    public String toString() {
        return "[program" + commandListNode + "]";
    }
}
