package com.deng;

/**
 * @Classname CommandNode
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/27 21:08
 * @Created by helloDeng
 */
public class CommandNode extends Node {
    private Node node;
    @Override
    public void parse(Context context) throws ParseException {
        if(context.currentToken().equals("repeat")){
            node = new RepeatCommandNode();
            node.parse(context);
        }else {
            node = new PrimitiveCommandNode();
            node.parse(context);
        }

    }

    @Override
    public String toString() {
        return node.toString();
    }
}
