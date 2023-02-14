package com.deng;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname IdCardFactory
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/14 15:04
 * @Created by helloDeng
 */
public class IdCardFactory extends Factory{
    private List<String> owners = new ArrayList<>();
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product p) {
        owners.add(((IDCard)p).getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }
}
