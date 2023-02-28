package com.deng;

import java.awt.*;

/**
 * @Classname DrawCanvas
 * @Description  实现"绘制对象的类"
 * @Version 1.0.0
 * @Date 2023/2/27 19:54
 * @Created by helloDeng
 */
public class DrawCanvas extends Canvas implements Drawable {

    private Color color = Color.red;
    private int radius = 6;
    private MacroCommand history;  //命令的历史记录

    public DrawCanvas(int width,int height,MacroCommand history) {
        setSize(width,height);
        setBackground(Color.white);
        this.history = history;
    }
    public void paint(Graphics g){         //重新全部绘制
        history.execute();
    }
    @Override
    public void draw(int x, int y) {
        Graphics graphics = getGraphics();
        graphics.setColor(color);
        graphics.fillOval(x - radius,y - radius,radius * 2,radius * 2);
    }
}
