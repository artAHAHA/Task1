package Task1.entities.background;

import Task1.entities.Drawable;

import java.awt.*;

public class Grass implements Drawable {

    private int width;
    private int height;

    public Grass(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(new Color(34, 139, 34)); // Set color to grass green
        g.fillRect(0, height / 2, width, height / 2);  // Draw the grass
    }
}
