package com.deng;

import java.util.Scanner;

/**
 * @Classname TestBuilderPattern
 * @Description       组装复杂的实例
 * @Version 1.0.0
 * @Date 2023/2/16 17:18
 * @Created by helloDeng
 *
 * BuilderPattern  Builder模式  用于组装具有复杂结构的实例
 * Builder负责定义用于生成实例的接口   建造者
 * TextBuilder和HTMLBuilder中定义了生成实例实际被调用的方法，还定义了获取最终生成结果的方法  具体的建造者
 * Director 使用Builder中定义的接口来生成实例，  监工
 */
public class TestBuilderPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if(s == null || s.length() <=0){
            usage();
            System.exit(0);
        }
        if(s.equals("plain")){
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            String result = textBuilder.getResult();
            System.out.println(result);
        } else if (s.equals("html")) {
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String result = htmlBuilder.getResult();
            System.out.println(result + "文件编写完成");
        }else{
            usage();
            System.exit(0);
        }
    }
    public static void usage(){
        System.out.println("Usage:java Main plain 编写纯文本文档");
        System.out.println("Usage:java Main html  编写html文档");
    }
}
