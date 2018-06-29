package frontEnd;

import javax.swing.*;
import java.awt.*;

public class WindowArray extends JFrame {
    private static int SIZE_X = 300;
    private static int SIZE_Y = 100;
    private static int HEIGHT = 600;
    private static int WIDTH = 300;
    private static String title = "Введите список группы";

    private WindowArray(){
        setTitle(title);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(SIZE_X, SIZE_Y, WIDTH, HEIGHT);
        setResizable(false);

        JTextArea textRespondents = new JTextArea();
        add(textRespondents, BorderLayout.CENTER);

        JButton bNext = new JButton("Далее");
        add(bNext, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new WindowArray();
    }
}
