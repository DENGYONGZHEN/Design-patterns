package com.deng;

/**
 * @Classname PrinterProxy
 * @Description    表示带名字的打印机的类（代理人）
 * @Version 1.0.0
 * @Date 2023/2/27 19:02
 * @Created by helloDeng
 */
public class PrinterProxy implements Printable{
    private String name;
    private Printer real;
    //private String classname; //被代理类名

    public PrinterProxy() {
    }

    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if(real != null){    //real不为null时，设置打印机的名字
            real.setPrinterName(name);
        }
        this.name = name;    //real为null时，设置自己（代理）的名字
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {      //只有当真正需要本人的时候才会生成本人
        realize();
        real.print(string);
    }

    private synchronized void realize() {    //生成本人
        if(real == null){
            real = new Printer(name);
        }
    }

    /**
     * 在不想知道Printer类的情况下，创建这个类的实例的方法
     */
    /*private synchronized void realize() {    //生成本人
        if(real == null){
            try {
                real = (Printer) Class.forName(classname).newInstance();
                real.setPrinterName(name);
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }*/
}
