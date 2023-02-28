package com.deng;

import java.io.BufferedReader;

import java.io.FileReader;


/**
 * @Classname TestInterpreter
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/27 20:27
 * @Created by helloDeng
 *
 * 需要解释的语言语法
 * <program>::=program <command list>     ====>                ProgramNode
 * <command list>::= <command>* end       ====>                CommandListNode
 * <command>::=<repeat command> | <primitive command>   ====>  CommandNode
 * <repeat command>::= repeat <number> <command list>   ====>  RepeatCommandNode
 * <primitive command>::= go | right | left             ====>  PrimitiveCommandNode
 *
 * program repeat 4 repeat 3 go right go left end right end end
 * 这个程序语言开始和结束标识是program和end，循环是以repeat开始，end结束，循环中可以再套循环
 *
 * 还采用了递归的方式，Node中定义了parse方法，具体实现在各个子类中不同  RepeatCommandNode类中的parse会递归下去
 *
 */
public class TestInterpreter {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("program.text"));  //读取外部文件
            String text;
            while ((text = reader.readLine()) != null){             //读取一整行数据
                System.out.println("text = \"" + text + "\"");
                Node programNode = new ProgramNode();
                programNode.parse(new Context(text));               //这一整行数据以字符串的形式作为参数创建上下文
                System.out.println("node = " +programNode);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
