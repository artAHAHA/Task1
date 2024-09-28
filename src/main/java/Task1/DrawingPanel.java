package Task1;

import Task1.entities.Background;
import Task1.entities.Boy;
import Task1.entities.Girl;

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
    private Boy boy;

    private Girl girl;
    private Background background;

    public DrawingPanel(final int timerDelay) {
        this.PANEL_WIDTH = 800;
        this.PANEL_HEIGHT = 600;
        this.TIMER_DELAY = timerDelay;

        timer = new Timer(timerDelay, this);
        timer.start();

        background = new Background();

        this.boy = new Boy(ticksFromStart, 900, 400, 400, Color.BLUE);

        this.girl = new Girl(ticksFromStart, 900, 400, 400, Color.magenta);
    }

    @Override
    protected void paintComponent(final Graphics gr) {
        super.paintComponent(gr);

        background.paint(gr, PANEL_WIDTH, PANEL_HEIGHT);

        boy.setX(ticksFromStart);

        boy.paint(gr);

        girl.setX(ticksFromStart+200);

        girl.paint(gr);
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == timer) {
            repaint();
            ++ticksFromStart;
        }
    }
}
