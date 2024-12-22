package com.example.Task1.entities;

import java.awt.*;

public interface Drawable {
    void draw(Graphics g);
    void setX(int x);

    void moveX(int i);

    int getX();

    int getY();
}
