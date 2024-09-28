package Task1;

import Task1.DrawingPanel;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private final DrawingPanel panel;

    public MainWindow() throws HeadlessException {
        panel = new DrawingPanel(100);
        this.add(panel);
    }
}
