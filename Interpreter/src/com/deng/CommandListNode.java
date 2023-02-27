package com.deng;


import java.util.ArrayList;
import java.util.List;

/**
 * @Classname CommandListNode
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/27 20:59
 * @Created by helloDeng
 */
public class CommandListNode extends Node {
    private List list = new ArrayList();

    @Override
    public void parse(Context context) throws ParseException {
        while (true){
            if(context.currentToken() == null){
                throw new ParseException("missing 'end' ");
            } else if (context.currentToken().equals("end")) {
                context.skipToken("end");
                break;
            }else {
                Node commandNode = new CommandNode();
                commandNode.parse(context);
                list.add(commandNode);
            }
        }
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
