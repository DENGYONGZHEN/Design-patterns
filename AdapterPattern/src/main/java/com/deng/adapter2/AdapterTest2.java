package com.deng.adapter2;



/**
 * @Classname AdapterTest2
 * @Description     对象适配器模式(使用委托的适配器)
 * @Version 1.0.0
 * @Date 2023/2/12 21:12
 * @Created by helloDeng
 *
 *适配器模式第二种：对象适配器模式(使用委托的适配器)
 *此时Print2不是接口而是类。java中一个实体类不能同时继承两个类
 *PrinterBanner2担任适配器，继承Print2,而且PrintBanner2中有Banner类型的成员变量，
 * 在构造函数中初始化Banner类型的成员变量，在调用PrintBanner2中的方法时，方法实际是通过
 * banner字段调用了Banner中的方法，这就形成一种委托关系
 */
public class AdapterTest2 {

    public static void main(String[] args) {
        Print2 hello = new PrintBanner2("hello");
        hello.printStrong();
        hello.printWeak();
    }
}
