package com.deng;

/**
 * @Classname RepeatCommandNode
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/27 21:24
 * @Created by helloDeng
 *
 * <repeat command>::= repeat <number> <command list>
 */
public class RepeatCommandNode extends Node {
    private int number;  //保存<number>对应的数据
    private Node commandListNode; //保存<command list>对应的 CommandListNode类的实例
    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("repeat");
        number = context.currentNumber();
        context.nextToken();
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    @Override
    public String toString() {
        return "[repeat " + number + " " +commandListNode + "]";
    }
}
