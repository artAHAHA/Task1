package Task1.entities.characters;

import Task1.CustomGraphics.CustomGraphics;
import Task1.entities.Drawable;

import java.awt.*;

public class Character implements Drawable {
    protected int x;
    protected int y;
    protected int BACKGROUND_WIDTH;
    protected int BACKGROUND_HEIGHT;
    protected Color clothesColor;
    private CustomGraphics customGraphics;

    public Character(final int x, final int y, final int width, final int height, final Color clothesColor) {
        this.x = x / 5;
        this.y = y / 5;
        this.BACKGROUND_WIDTH = width / 2;
        this.BACKGROUND_HEIGHT = height / 2;
        this.clothesColor = clothesColor;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public void setX(int x) {
        this.x = x;
    }


    public void setY(int y) {
        this.y = y;
    }


    public void setWidth(int width) {
        this.BACKGROUND_WIDTH = width;
    }


    public void setHeight(int height) {
        this.BACKGROUND_HEIGHT = height;
    }

    public void moveX(int deltaX) {
        this.x += deltaX;
    }

    protected void drawHead(Graphics2D g2d) {

        g2d.setColor(Color.PINK);
        g2d.fillOval(x + (int) (BACKGROUND_WIDTH / 3.2), y + BACKGROUND_HEIGHT / 16, (int) (BACKGROUND_WIDTH / 2.6), (int) (BACKGROUND_HEIGHT / 2.6)); // Голова
        g2d.setColor(Color.BLACK);
        CustomGraphics.drawOval(g2d,x + (int) (BACKGROUND_WIDTH / 3.2), y + BACKGROUND_HEIGHT / 16, (int) (BACKGROUND_WIDTH / 2.6), (int) (BACKGROUND_HEIGHT / 2.6));
    }

    protected void drawEye(Graphics2D g2d, int x, int y) {

        g2d.setColor(Color.WHITE);
        g2d.fillOval(x, y, BACKGROUND_WIDTH / 10, BACKGROUND_WIDTH / 10);
        g2d.setColor(Color.BLACK);
        CustomGraphics.drawOval(g2d, x, y, BACKGROUND_WIDTH / 10, BACKGROUND_WIDTH / 10);

        g2d.setColor(Color.BLUE);
        g2d.fillOval(x + BACKGROUND_WIDTH / 40, y + BACKGROUND_WIDTH / 40, BACKGROUND_WIDTH / 20, BACKGROUND_WIDTH / 20);
        g2d.setColor(Color.GRAY);
        CustomGraphics.drawOval(g2d, x + BACKGROUND_WIDTH / 40, y + BACKGROUND_WIDTH / 40, BACKGROUND_WIDTH / 20, BACKGROUND_WIDTH / 20);

        g2d.setColor(Color.BLACK);
        g2d.fillOval(x + BACKGROUND_WIDTH / 27, y + BACKGROUND_WIDTH / 27, BACKGROUND_WIDTH / 40, BACKGROUND_WIDTH / 40);
    }

    protected void drawMouth(Graphics2D g2d) {
        g2d.setColor(Color.BLACK);
        g2d.drawArc(x + (int) (BACKGROUND_WIDTH / 2.29), y + (int) (BACKGROUND_HEIGHT / 3.6363), (int) (BACKGROUND_WIDTH / 8), (int) (BACKGROUND_HEIGHT / 16), 0, -180);
    }

    protected void drawCap(Graphics2D g2d) {
        g2d.setColor(Color.BLACK);
        g2d.fillArc(x + (int) (BACKGROUND_WIDTH / 1.5), y + BACKGROUND_HEIGHT / 8, (int) (BACKGROUND_WIDTH / 8), (int) (BACKGROUND_HEIGHT / 16), 0, 180);

        g2d.setColor(Color.BLACK);
        g2d.fillArc(x + (int) (BACKGROUND_WIDTH / 3.2), y + BACKGROUND_HEIGHT / 16, (int) (BACKGROUND_WIDTH / 2.6), (int) (BACKGROUND_HEIGHT / 5.3), 0, 180);
    }

    protected void drawBody(Graphics2D g2d) {
        g2d.setColor(Color.BLACK);
        g2d.drawRect(x + (int) (BACKGROUND_WIDTH / 2.66666), y + (int) (BACKGROUND_HEIGHT / 2.29), BACKGROUND_WIDTH / 4, (int) (BACKGROUND_HEIGHT / 2.6));
    }

    protected void drawArm(Graphics2D g2d, boolean isLeft) {
        int armX = isLeft ? x + (BACKGROUND_WIDTH / 8) : x + (int) (BACKGROUND_WIDTH / 1.6);
        g2d.setColor(Color.PINK);
        g2d.fillRect(armX, y + (int) (BACKGROUND_HEIGHT / 2.29), BACKGROUND_WIDTH / 4, BACKGROUND_HEIGHT / 16);
    }

    protected void drawLeg(Graphics2D g2d, boolean isLeft) {
        int legX = isLeft ? x + (int) (BACKGROUND_WIDTH / 2.66666) : x + (int) (BACKGROUND_WIDTH / 1.9);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(legX, y + (int) (BACKGROUND_HEIGHT / 1.22), BACKGROUND_WIDTH / 10, (int) (BACKGROUND_HEIGHT / 3));
    }

    protected void drawClothes(Graphics2D g2d, boolean isLeft, Color clothesColor) {
        drawShirt(g2d, true, clothesColor);
        drawShirt(g2d, false, clothesColor);
        drawPants(g2d, true, clothesColor);
        drawPants(g2d, false, clothesColor);
    }

    private void drawShirt(Graphics2D g2d, boolean isLeft, Color clothesColor) {
        g2d.setColor(clothesColor);
        g2d.fillRect(x + (int) (BACKGROUND_WIDTH / 2.66666), y + (int) (BACKGROUND_HEIGHT / 2.29), BACKGROUND_WIDTH / 4, (int) (BACKGROUND_HEIGHT / 2.6));
        int sleeveX = isLeft ? x + (int) (BACKGROUND_WIDTH / 3.165) : x + (int) (BACKGROUND_WIDTH / 1.6);
        g2d.setColor(clothesColor);
        g2d.fillRect(sleeveX, y + (int) (BACKGROUND_HEIGHT / 2.29), BACKGROUND_WIDTH / 16, BACKGROUND_HEIGHT / 16);
    }

    private void drawPants(Graphics2D g2d, boolean isLeft, Color clothesColor) {
        int legX = isLeft ? x + (int) (BACKGROUND_WIDTH / 2.66666) : x + (int) (BACKGROUND_WIDTH / 1.9);
        g2d.setColor(clothesColor);
        g2d.fillRect(legX, y + (int) (BACKGROUND_HEIGHT / 1.22), BACKGROUND_WIDTH / 10, (int) (BACKGROUND_HEIGHT / 3));
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        drawHead(g2d);

        drawEye(g2d, x + (int) (BACKGROUND_WIDTH / 2.54), y + (int) (BACKGROUND_HEIGHT / 5.3));
        drawEye(g2d, x + (int) (BACKGROUND_WIDTH / 1.89), y + (int) (BACKGROUND_HEIGHT / 5.3));

        drawMouth(g2d);

        drawCap(g2d);

        drawBody(g2d);

        drawArm(g2d, true);
        drawArm(g2d, false);

        drawLeg(g2d, true);
        drawLeg(g2d, false);

        drawClothes(g2d, true, clothesColor);
        drawClothes(g2d, false, clothesColor);
    }
}
