package com.deng;

/**
 * @Classname PrimitiveCommandNode
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/2/27 21:24
 * @Created by helloDeng
 */
public class PrimitiveCommandNode extends Node {
    private String name;
    @Override
    public void parse(Context context) throws ParseException {
        name = context.currentToken();
        context.skipToken(name);
        if(!name.equals("go") && !name.equals("right") && !name.equals("left")){
            throw new ParseException(name + "is undefined");
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
