package Task1.entities;

import java.awt.*;

public class Background {

    // Метод для отрисовки фона
    public void paint(Graphics g, int width, int height) {
        // небо
        g.setColor(new Color(135, 206, 235));
        g.fillRect(0, 0, width, height/2);

        // трава
        g.setColor(new Color(34, 139, 34));
        g.fillRect(0, height / 2, width, height / 2);

        // деревья
        drawTree(g, 100, height / 2 - 50);
        drawTree(g, 300, height / 2 - 50);
        drawTree(g, 500, height / 2 - 50);

        // кусты
        drawBush(g, 200, height / 2);
        drawBush(g, 400, height / 2);
    }

    private void drawTree(Graphics g, int x, int y) {

        g.setColor(new Color(139, 69, 19));
        g.fillRect(x, y, 20, 100);

        g.setColor(new Color(0, 128, 0));
        g.fillOval(x - 30, y - 40, 80, 80);
    }

    private void drawBush(Graphics g, int x, int y) {
        g.setColor(new Color(0, 100, 0));
        g.fillOval(x - 20, y - 10, 40, 40);
    }
}
