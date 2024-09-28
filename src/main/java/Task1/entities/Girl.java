package Task1.entities;

import java.awt.*;

public class Girl extends Boy {
    public Girl(int x, int y, int width, int height, Color clothesColor) {
        super(x, y, width, height, clothesColor);
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        drawCap(g);

    }

    protected void drawCap(Graphics g2d){
        super.drawCap((Graphics2D) g2d);
        g2d.setColor(Color.BLACK);
        g2d.fillArc(x + (int) (BACKGROUND_WIDTH / 1.5), y + BACKGROUND_HEIGHT / 8, (int) (BACKGROUND_WIDTH / 8), (int) (BACKGROUND_HEIGHT / 16), 0, 180);

        g2d.setColor(Color.red);
        g2d.fillArc(x + (int) (BACKGROUND_WIDTH / 3.2), y + BACKGROUND_HEIGHT / 16, (int) (BACKGROUND_WIDTH / 2.6), (int) (BACKGROUND_HEIGHT / 5.3), 0, 180);
    }


}
