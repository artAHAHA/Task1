package com.example.Task1;

import com.example.Task1.entities.Drawable;
import com.example.Task1.entities.characters.Boy;
import com.example.Task1.entities.characters.Girl;
import com.example.Task1.entities.background.Background;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MainWindow extends JFrame {
    private final DrawingPanel panel;

    private final int WIDTH;
    private final int HEIGHT;

    public MainWindow(int width, int height) throws HeadlessException {
        WIDTH = width;
        HEIGHT = height;


        Background background = new Background(width, height);

        List<Drawable> drawables = new ArrayList<>();
        drawables.add(new Boy(200, 900, 400, 400, Color.BLUE, true));
        drawables.add(new Girl(200, 900, 400, 400, Color.MAGENTA, false));


        panel = new DrawingPanel(100, drawables, background);
        this.add(panel);

        this.setSize(width, height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainWindow mainWindow = new MainWindow(800, 600);
            mainWindow.setVisible(true);
        });
    }
}
