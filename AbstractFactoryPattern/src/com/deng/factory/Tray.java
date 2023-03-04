package com.deng.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Tray
 * @Description      抽象零件：表示含有Link和Tray的类
 * @Version 1.0.0
 * @Date 2023/2/16 19:28
 * @Created by helloDeng
 */
public abstract class Tray extends Item{                //Tray  托盘
    protected List tray = new ArrayList();

    public Tray(String caption) {
        super(caption);
    }
    public void add(Item item){
        tray.add(item);
    }
}
