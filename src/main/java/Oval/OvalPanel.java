package Oval;

import javax.swing.*;
import java.awt.*;

public class OvalPanel extends JPanel {

    private CustomGraphics customGraphics;

    public OvalPanel() {
        this.customGraphics = new CustomGraphics();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        customGraphics.drawOval(g2d, 50, 50, 500, 500); // Рисуем овал
    }
}
