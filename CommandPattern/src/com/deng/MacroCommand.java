package com.deng;

import java.util.Iterator;
import java.util.Stack;

/**
 * @Classname MacroCommand
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/27 19:44
 * @Created by helloDeng
 */
public class MacroCommand implements Command{

    private Stack commands = new Stack();


    @Override
    public void execute() {
        Iterator iterator = commands.iterator();
        while (iterator.hasNext()){
            ((Command)iterator.next()).execute();
        }
    }
    public void append(Command cmd){
        if(cmd != this){
            commands.push(cmd);
        }
    }
    public void undo(){
        if(!commands.empty()){
            commands.pop();
        }
    }
    public void clear(){
        commands.clear();
    }
}
