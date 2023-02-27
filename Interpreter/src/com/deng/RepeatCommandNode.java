package com.deng;

/**
 * @Classname RepeatCommandNode
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/2/27 21:24
 * @Created by helloDeng
 */
public class RepeatCommandNode extends Node {
    private int number;
    private Node commandListNode;
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
        return "RepeatCommandNode{" +
                "number=" + number +
                ", commandListNode=" + commandListNode +
                '}';
    }
}
