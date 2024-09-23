package com.example.demo2.algorithms;

import javafx.scene.canvas.GraphicsContext;

public class DDA_Algorithm {
    public static void ddaLine(GraphicsContext gc, int x1, int y1, int x2, int y2) {
        int dx = x2 - x1;
        int dy = y2 - y1;

        int steps = Math.max(Math.abs(dx), Math.abs(dy));

        double xIncrement = dx / (double) steps;
        double yIncrement = dy / (double) steps;

        double x = x1;
        double y = y1;

        for (int i = 0; i <= steps; i++) {
            gc.strokeRect(Math.round(x), Math.round(y), 1, 1);
            x += xIncrement;
            y += yIncrement;
        }
    }
}
