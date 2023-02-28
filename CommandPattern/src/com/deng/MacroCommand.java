package com.deng;

import java.util.Iterator;
import java.util.Stack;

/**
 * @Classname MacroCommand
 * @Description   表示"由多条命令整合成的命令"的类
 * @Version 1.0.0
 * @Date 2023/2/27 19:44
 * @Created by helloDeng
 */
public class MacroCommand implements Command{

    private Stack commands = new Stack();//commands中保存多个Command类型实例（实现Command接口的类的实例）


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
    public void undo(){                  //删除commands中的最后一条命令,也就是栈结构的最上面一条命令
        if(!commands.empty()){
            commands.pop();  //Removes the object at the top of this stack and returns that object as the value of this function.
        }
    }
    public void clear(){                 //删除所有command
        commands.clear();
    }
}
