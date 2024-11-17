package Task1.CustomGraphics;

import java.awt.*;

public class CustomGraphics {
    public static void drawOval(Graphics2D g2d, int x, int y, int width, int height) {
        int a = width / 2;
        int b = height / 2;
        int centerX = x + a;
        int centerY = y + b;

        g2d.setColor(new Color(7));

        double step = 0.01;

        for (double angle = 0; angle < 2 * Math.PI; angle += step) {
            int px = (int) (centerX + a * Math.cos(angle));
            int py = (int) (centerY + b * Math.sin(angle));
            g2d.drawLine(px, py, px, py);
        }
    }
}



