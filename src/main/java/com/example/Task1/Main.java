package com.example.Task1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MainWindow window = new MainWindow(800, 600);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(800, 600);
        window.setVisible(true);
        window.setResizable(false);
    }
}
