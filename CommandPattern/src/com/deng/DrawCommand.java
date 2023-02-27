package com.deng;

import java.awt.*;

/**
 * @Classname DrawCommand
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/27 19:49
 * @Created by helloDeng
 */
public class DrawCommand implements Command{

    protected Drawable drawable;

    private Point position;

    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
