package com.deng;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @Classname Pagemaker
 * @Description          根据邮件地址编写该用户的的Web页面
 * @Version 1.0.0
 * @Date 2023/2/26 14:07
 * @Created by helloDeng
 */
public class Pagemaker {
    private Pagemaker() {            //构造器私有
    }
    public static void makeWelcomePage(String mailaddr,String filename){   //只提供了这个方法，就是窗口
        try{
            Properties maildata = Database.getProperties("maildata");
            String username = maildata.getProperty(mailaddr);
            HtmlWriter htmlWriter = new HtmlWriter(new FileWriter(filename));
            htmlWriter.title("welcome to" +username +"'s page");
            htmlWriter.paragraph(username + "欢迎来到" + username + "的主页");
            htmlWriter.paragraph("等着你的邮件哦");
            htmlWriter.mailto(mailaddr,username);
            htmlWriter.close();
            System.out.println(filename + "is created for" + mailaddr +"(" +username +")");
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
