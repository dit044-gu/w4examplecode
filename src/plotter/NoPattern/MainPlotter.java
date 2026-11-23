package plotter.NoPattern;

import javax.swing.*;

public class MainPlotter {

    static void main() {
        Plotter p = new Plotter();
        displayOnScreen(p);
    }

    private static void displayOnScreen(Plotter p) {
        JFrame w = new JFrame();
        w.add(p);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setSize(400, 200);
        w.setVisible(true);

    }
}