package com.deng;

import java.awt.*;

/**
 * @Classname DrawCommand
 * @Description  表示"绘制一个点的命令"的类
 * @Version 1.0.0
 * @Date 2023/2/27 19:49
 * @Created by helloDeng
 */
public class DrawCommand implements Command{

    protected Drawable drawable;   //绘制的对象

    private Point position;       //绘制的位置

    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
