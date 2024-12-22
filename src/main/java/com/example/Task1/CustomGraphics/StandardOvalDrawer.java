package com.example.Task1.CustomGraphics;

import java.awt.*;

public class StandardOvalDrawer implements OvalDrawer{

    @Override
    public void drawOval(Graphics2D g2d, int x, int y, int width, int height) {
        g2d.drawOval(x,y,width,height);
    }
}
