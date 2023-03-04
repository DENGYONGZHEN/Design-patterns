package com.deng;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname Manager
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/15 15:39
 * @Created by helloDeng
 *
 * Manager中定义了一个map集合用于存储实例名和实例对象，还有一个create方法接收实例名，可以获取实例对象去创建实例
 */
public class Manager {
    Map<String,Product> showcase = new HashMap<>();
    public void register(String name,Product proto){
        showcase.put(name,proto);
    }
    public Product create(String protoName){
        Product product = showcase.get(protoName);       //使用Product接口类型的对象复制实例
        return product.creatClone();
    }
}
