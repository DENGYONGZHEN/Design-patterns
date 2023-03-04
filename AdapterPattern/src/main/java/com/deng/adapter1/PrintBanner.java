package com.deng.adapter1;

import com.deng.Banner;
import com.deng.adapter1.Print;

/**
 * @Classname PrintBanner
 * @Description          适配器
 * @Version 1.0.0
 * @Date 2023/2/12 20:48
 * @Created by helloDeng
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String name){
        super(name);
    }
    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
