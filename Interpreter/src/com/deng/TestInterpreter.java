package com.deng;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

/**
 * @Classname TestInterpreter
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/27 20:27
 * @Created by helloDeng
 */
public class TestInterpreter {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("program.text"));
            String text;
            while ((text = reader.readLine()) != null){
                System.out.println("text = \"" + text + "\"");
                Node programNode = new ProgramNode();
                programNode.parse(new Context(text));
                System.out.println("node = " +programNode);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
