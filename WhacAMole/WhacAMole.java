import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.JFrame;

import java.swing.*;

public class WhacAMole {

    int boardWidth = 600;
    int boardHeight = 650;
    JFrame frame = new JFrame("Mario: Whac A Mole");

    WhacAMole() {
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(frame);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
    }
}
