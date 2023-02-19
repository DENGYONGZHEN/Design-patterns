package com.deng;

import com.deng.factory.Factory;
import com.deng.factory.Link;
import com.deng.factory.Page;
import com.deng.factory.Tray;


import java.util.Scanner;

/**
 * @Classname TestAbstractFactoryPattern
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/16 23:04
 * @Created by helloDeng
 *
 * AbstractFactoryPattern 抽象工厂模式
 * 抽象产品AbstractProduct：Link,Tray,Page
 * 抽象工厂AbstractFactory：Factory
 * 委托者：只会调用抽象工厂和抽象角色，对具体零件，产品和工厂一无所知
 * 具体产品：ListLink,ListTray,ListPage
 * 具体工厂：ListFactory
 * 增加新的具体工厂和具体产品也很容易，就是编写Factory,Link,Tray,Page的子类，并实现他们定义的抽象方法
 */
public class TestAbstractFactoryPattern {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if(str == null || str.length() <= 0){
            System.out.println("Usage:java TestAbstractFactoryPattern class.name.of.ConcreteFactory");
            System.out.println("Example 1:java TestAbstractFactoryPattern listfactory.ListFactory");
            System.out.println("Example 2:java TestAbstractFactoryPattern tablefactory.TableFactory");
        }
        Factory factory = Factory.getFactory(str);
        Link github = factory.createLink("github", "https://www.github.com");
        Link pornhub = factory.createLink("pornhub", "http://www.pornhub.com");

        Link google = factory.createLink("google", "http://www.google.com");
        Link apple = factory.createLink("apple", "http://www.apple.com");
        Link microsoft = factory.createLink("microsoft", "http://www.microsoft.com");
        Link chatgpt = factory.createLink("chatgpt", "https://www.openai.com");

        Tray hub = factory.createTray("hub");
        hub.add(github);
        hub.add(pornhub);

        Tray mobileOs = factory.createTray("mobile os");
        mobileOs.add(google);
        mobileOs.add(apple);

        Tray search = factory.createTray("search");
        search.add(microsoft);
        search.add(chatgpt);
        search.add(google);

        Page page = factory.createPage("LinkPage", "deng");
        page.add(hub);
        page.add(mobileOs);
        page.add(search);
        page.output();
    }
}
