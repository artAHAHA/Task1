package Task1.entities.background;

import Task1.entities.Drawable;

import java.awt.*;

public class Sky implements Drawable {
    private int width;
    private int height;

    public Sky(int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw(Graphics g) {
        g.setColor(new Color(135, 206, 235));
        g.fillRect(0, 0, width, height/2);
    }
}