package Task1;

import Task1.entities.background.Background;
import Task1.entities.characters.Character;
import Task1.entities.characters.Boy;
import Task1.entities.characters.Girl;

import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawingPanel extends JPanel implements ActionListener {

    private final int PANEL_WIDTH;
    private final int PANEL_HEIGHT;
    private final int TIMER_DELAY;
    private Timer timer;

    private int ticksFromStart = 0;
    private final List<Character> characters;
    private final Background background;

    public DrawingPanel(final int timerDelay, List<Character> characters, Background background) {
        this.PANEL_WIDTH = 800;
        this.PANEL_HEIGHT = 600;
        this.TIMER_DELAY = timerDelay;
        this.characters = characters;
        this.background = background;

        timer = new Timer(timerDelay, this);
        timer.start();
    }

    @Override
    protected void paintComponent(final Graphics gr) {
        super.paintComponent(gr);

        background.draw(gr);

        int deltaX = 200;
        for (int i = 0; i < characters.size(); i++) {
            Character character = characters.get(i);

            character.setX(ticksFromStart + i * deltaX);

            if (character instanceof Boy boy) {
                boy.draw(gr);
            } else if (character instanceof Girl girl) {
                girl.draw(gr);
            } else {
                character.draw(gr);
            }
        }
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        repaint();
        ++ticksFromStart;
    }
}
