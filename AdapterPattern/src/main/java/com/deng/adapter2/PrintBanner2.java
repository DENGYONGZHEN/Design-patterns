package com.deng.adapter2;

import com.deng.Banner;
import com.deng.adapter2.Print2;

/**
 * @Classname PrintBanner2
 * @Description
 * @Version 1.0.0    第二种是配模式
 * @Date 2023/2/12 21:02
 * @Created by helloDeng
 */
public class PrintBanner2 extends Print2 {
    private Banner banner;
    public PrintBanner2(String name){
        this.banner = new Banner(name);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }


}




