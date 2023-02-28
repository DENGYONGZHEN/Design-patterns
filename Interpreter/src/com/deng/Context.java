package com.deng;

import java.util.StringTokenizer;

/**
 * @Classname Context  语法解析上下文
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/27 21:05
 * @Created by helloDeng
 */
public class Context {
    private StringTokenizer tokenizer;  //StringTokenizer 可以将传过来的字符串分割成标记，分割字符串时使用的是空格之类的
    private String currentToken;
    public Context(String text){
        tokenizer = new StringTokenizer(text);
        nextToken();
    }

    public String nextToken() {                  //获取下一个标记

        if(tokenizer.hasMoreTokens()){
            currentToken = tokenizer.nextToken();
        }else {
            currentToken = null;
        }
        return currentToken;
    }
    public String currentToken(){               //获取当前标记
        return currentToken;
    }
    public void skipToken(String token) throws ParseException{          //先检查当前标记，然后获取下一个标记
        if(!token.equals(currentToken)){
            throw new ParseException("Warning: " + token + "is expected,but" + currentToken + "is found");
        }
        nextToken();
    }
    public int currentNumber() throws ParseException{           //获取当前标记对应的数值
        int number = 0;
        try{
            number = Integer.parseInt(currentToken);
        }catch (NumberFormatException e){
            throw new ParseException("Warning:" + e);
        }
        return number;
    }
}
