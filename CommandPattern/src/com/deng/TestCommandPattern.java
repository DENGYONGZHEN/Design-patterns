package com.deng;

import javax.swing.*;
import java.awt.event.*;

/**
 * @Classname TestCommandPattern
 * @Description  命令也是类
 * @Version 1.0.0
 * @Date 2023/2/27 19:11
 * @Created by helloDeng
 */
public class TestCommandPattern extends JFrame implements ActionListener, MouseMotionListener, WindowListener {


    private MacroCommand history = new MacroCommand();        //绘制历史记录传给DrawCanvas，和DrawCanvas共享绘制历史记录
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);   //绘制区域
    private JButton clearButton = new JButton("clear");

    public TestCommandPattern(String title) {
        super(title);
        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        clearButton.addActionListener(this);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);
        pack();
        show();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearButton) {
            history.clear();
            canvas.repaint();
        }

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Command cmd = new DrawCommand(canvas, e.getPoint());
        history.append(cmd);
        cmd.execute();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    public static void main(String[] args) {
        new TestCommandPattern("Command Pattern sample");
    }
}
