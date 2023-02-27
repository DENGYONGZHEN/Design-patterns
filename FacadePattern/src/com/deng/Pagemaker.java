package com.deng;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @Classname Pagemaker
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/26 14:07
 * @Created by helloDeng
 */
public class Pagemaker {
    public Pagemaker() {
    }
    public static void makeWelcomePage(String mailaddr,String filename){
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
