package com.example.demo2.algorithms;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class DDA_Algorithm {

    public static void drawLine(GraphicsContext gc, int x1, int y1, int x2, int y2, Color color1, Color color2) {
        int dx = x2 - x1;
        int dy = y2 - y1;

        int steps = Math.max(Math.abs(dx), Math.abs(dy));

        double xIncrement = dx / (double) steps;
        double yIncrement = dy / (double) steps;

        double x = x1;
        double y = y1;

        double r1 = color1.getRed(), g1 = color1.getGreen(), b1 = color1.getBlue();
        double r2 = color2.getRed(), g2 = color2.getGreen(), b2 = color2.getBlue();


        double rStep = (r2 - r1) / steps;
        double gStep = (g2 - g1) / steps;
        double bStep = (b2 - b1) / steps;

        for (int i = 0; i <= steps; i++) {
            Color interpolatedColor = Color.color(
                    clamp(r1 + i * rStep),
                    clamp(g1 + i * gStep),
                    clamp(b1 + i * bStep)
            );

            gc.setStroke(interpolatedColor);
            gc.strokeRect(Math.round(x), Math.round(y), 1, 1);

            x += xIncrement;
            y += yIncrement;
        }
    }

    private static double clamp(double value) {
        return Math.max(0, Math.min(1, value));
    }
}
