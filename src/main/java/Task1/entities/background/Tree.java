package Task1.entities.background;

import Task1.entities.Drawable;

import java.awt.*;

public class Tree implements Drawable {
    private final int x;
    private final int y;

    public Tree(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(new Color(139, 69, 19));
        g.fillRect(x, y, 20, 100);

        g.setColor(new Color(0, 128, 0));
        g.fillOval(x - 30, y - 40, 80, 80);
    }

    @Override
    public void setX(int x) {

    }

    @Override
    public void moveX(int i) {

    }

    @Override
    public int getX() {
        return 0;
    }

    @Override
    public int getY() {
        return 0;
    }
}
