package com.deng;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @Classname Database
 * @Description         从邮件地址中获取用户名的类
 * @Version 1.0.0
 * @Date 2023/2/26 13:44
 * @Created by helloDeng
 */
public class Database {
    private Database() {            //构造器私有
    }
    public static Properties getProperties(String dbName){        //根据数据库名获取Properties
        String filename = dbName + ".txt";
        Properties prop = new Properties();
        try{
            prop.load(new FileInputStream(filename));
        }catch (IOException e){
            System.out.println("warning: " + filename + "is not found.");
        }
        return  prop;
    }
}
