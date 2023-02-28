package com.deng;



/**
 * @Classname Printer
 * @Description   表示带名字的打印机的类（本人）
 * @Version 1.0.0
 * @Date 2023/2/27 18:53
 * @Created by helloDeng
 */
public class Printer implements Printable {
    private String name;

    public Printer() {
        System.out.println("正在生成Printer的实例");
    }

    public Printer(String name) {
        this.name = name;
        System.out.println("正在生成Printer的实例（" +name +"）");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        System.out.println("====" + name + "======");
        System.out.println(string);
    }
    private void heavyJob(String msg){
        System.out.println(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            System.out.println(".");
        }
        System.out.println("结束。");
    }
}
