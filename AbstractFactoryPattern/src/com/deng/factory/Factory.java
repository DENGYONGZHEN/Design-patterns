package com.deng.factory;

/**
 * @Classname Factory
 * @Description  表示抽象工厂的类（制作Link、Tray、Page）
 * @Version 1.0.0
 * @Date 2023/2/16 19:40
 * @Created by helloDeng
 */
public abstract class Factory {
    /**
     * 通过调用Class类的forName方法来动态的读取类信息，接着使用newInstance方法生成该类的实例
     * @param className
     * @return  虽然生成的是具体工厂的实例，但是返回值类型是抽象工厂类型
     */
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
