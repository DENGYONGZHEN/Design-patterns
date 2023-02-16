package com.deng.factory;

/**
 * @Classname Factory
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/16 19:40
 * @Created by helloDeng
 */
public abstract class Factory {
    public static Factory getFactory(String className){
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(className).newInstance();
        } catch (ClassNotFoundException e) {
            System.err.println("没有找到" + className +"类");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }
    public abstract Link createLink(String caption,String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title,String author);
}
