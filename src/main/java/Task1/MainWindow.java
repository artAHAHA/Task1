package Task1;

import Task1.entities.characters.Boy;
import Task1.entities.characters.Girl;
import Task1.entities.background.Background;
import Task1.entities.characters.Character;

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

        List<Character> characters = new ArrayList<>();
        characters.add(new Boy(200, 900, 400, 400, Color.BLUE));
        characters.add(new Girl(200, 900, 400, 400, Color.MAGENTA));


        panel = new DrawingPanel(100, characters, background);
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
