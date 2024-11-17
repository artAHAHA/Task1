package Oval;

import javax.swing.*;

public class OvalFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Oval Drawing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 900);

        OvalPanel ovalPanel = new OvalPanel();
        frame.add(ovalPanel);

        frame.setVisible(true);
    }
}
