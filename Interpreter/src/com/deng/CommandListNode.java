package com.deng;


import java.util.ArrayList;
import java.util.List;

/**
 * @Classname CommandListNode
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/27 20:59
 * @Created by helloDeng
 *
 * <command list>::= <command>* end   语法树的第二层，保证<command>0次以上，并以end结束
 */
public class CommandListNode extends Node {
    private List list = new ArrayList(); //保存与<command>对应的CommandNode类的实例

    @Override
    public void parse(Context context) throws ParseException {
        while (true){
            if(context.currentToken() == null){
                throw new ParseException("missing 'end' ");
            } else if (context.currentToken().equals("end")) {
                context.skipToken("end");
                break;
            }else {
                Node commandNode = new CommandNode();  //生成<command>对应的CommandNode类的实例
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
