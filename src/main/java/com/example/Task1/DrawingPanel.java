package com.example.Task1;

import com.example.Task1.entities.Drawable;
import com.example.Task1.entities.background.Background;

import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawingPanel extends JPanel implements ActionListener {

    private final int TIMER_DELAY;
    private Timer timer;

    private int ticksFromStart = 0;
    private final List<Drawable> drawables;
    private final Background background;

    public DrawingPanel(final int timerDelay, List<Drawable> drawables, Background background) {
        this.TIMER_DELAY = timerDelay;
        this.drawables = drawables;
        this.background = background;

        timer = new Timer(timerDelay, this);
        timer.start();
    }

    @Override
    protected void paintComponent(final Graphics gr) {
        super.paintComponent(gr);

        background.draw(gr);
        int deltaX = 200;
        for (int i = 0; i < drawables.size(); i++) {
            Drawable drawable = drawables.get(i);
            drawable.setX(ticksFromStart + i * deltaX);
            drawable.draw(gr);
        }
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        repaint();
        ++ticksFromStart;
    }
}
