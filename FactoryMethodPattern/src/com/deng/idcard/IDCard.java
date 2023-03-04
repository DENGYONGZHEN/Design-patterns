package com.deng.idcard;

import com.deng.framwork.Product;

/**
 * @Classname IDCard
 * @Description 实现了use方法的类
 * @Version 1.0.0
 * @Date 2023/2/14 14:35
 * @Created by helloDeng
 */
public class IDCard extends Product {
    private String owner;
    IDCard(String owner){
        System.out.println("制作" + owner + "的ID卡");
        this.owner = owner;
    }
    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡");
    }

    public String getOwner() {
        return owner;
    }
}
