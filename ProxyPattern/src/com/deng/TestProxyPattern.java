package com.deng;

/**
 * @Classname TestProxyPattern
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/27 18:52
 * @Created by helloDeng
 */
public class TestProxyPattern {
    public static void main(String[] args) {
        PrinterProxy alice = new PrinterProxy("alice");
        System.out.println("现在的名字是" + alice.getPrinterName());
        alice.setPrinterName("bob");
        System.out.println("现在的名字是" + alice.getPrinterName());
        alice.print("hello,world");
    }
}
