package com.example.demo2.algorithms;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class WuAlgorithm {

    private static void plot(GraphicsContext gc, double x, double y, double brightness, Color color) {
        gc.setFill(new Color(color.getRed(), color.getGreen(), color.getBlue(), brightness));
        gc.fillRect(x, y, 1, 1);
    }


    public static void drawLine(GraphicsContext gc, int x1, int y1, int x2, int y2, Color startColor, Color endColor) {

        double dx = x2 - x1;
        double dy = y2 - y1;

        int steps = (int) Math.max(Math.abs(dx), Math.abs(dy));
        double rStep = (endColor.getRed() - startColor.getRed()) / steps;
        double gStep = (endColor.getGreen() - startColor.getGreen()) / steps;
        double bStep = (endColor.getBlue() - startColor.getBlue()) / steps;


        boolean isSteep = Math.abs(dy) > Math.abs(dx);
        if (isSteep) {

            int temp = x1; x1 = y1; y1 = temp;
            temp = x2; x2 = y2; y2 = temp;
        }

        if (x1 > x2) {

            int temp = x1; x1 = x2; x2 = temp;
            temp = y1; y1 = y2; y2 = temp;
        }


        dx = x2 - x1;
        dy = y2 - y1;
        double gradient = dy / dx;

        double xEnd = Math.round(x1);
        double yEnd = y1 + gradient * (xEnd - x1);
        double xGap = 1 - fractionalPart(x1 + 0.5);
        double xPixel1 = xEnd;
        double yPixel1 = Math.floor(yEnd);

        Color currentColor = startColor;
        plot(gc, isSteep ? yPixel1 : xPixel1, isSteep ? xPixel1 : yPixel1, fractionalPart(yEnd) * xGap, currentColor);
        plot(gc, isSteep ? yPixel1 + 1 : xPixel1, isSteep ? xPixel1 : yPixel1 + 1, reverseFractionalPart(yEnd) * xGap, currentColor);

        double intery = yEnd + gradient;


        for (int x = (int) (xPixel1 + 1); x <= x2; x++) {
            currentColor = new Color(
                    currentColor.getRed() + rStep,
                    currentColor.getGreen() + gStep,
                    currentColor.getBlue() + bStep,
                    1.0
            );

            plot(gc, isSteep ? Math.floor(intery) : x, isSteep ? x : Math.floor(intery), fractionalPart(intery), currentColor);
            plot(gc, isSteep ? Math.floor(intery) + 1 : x, isSteep ? x : Math.floor(intery) + 1, reverseFractionalPart(intery), currentColor);
            intery += gradient;
        }
    }

    private static double fractionalPart(double x) {
        return x - Math.floor(x);
    }

    private static double reverseFractionalPart(double x) {
        return 1 - fractionalPart(x);
    }
}
