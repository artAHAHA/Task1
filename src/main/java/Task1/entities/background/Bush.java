package Task1.entities.background;

import Task1.entities.Drawable;

import java.awt.*;

public class Bush implements Drawable {
    private final int x;
    private final int y;

    public Bush(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(new Color(0, 100, 0));
        g.fillOval(x - 20, y - 10, 40, 40);
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
