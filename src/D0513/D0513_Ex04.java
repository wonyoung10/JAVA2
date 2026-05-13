package D0513;

import java.awt.*;
import javax.swing.*;

public class D0513_Ex04 extends JFrame {

    public D0513_Ex04() {
        super("GridLayout 예제");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(2, 5));

        for (int i = 0; i < 10; i++) {
            JButton button = new JButton(Integer.toString(i));
            contentPane.add(button);
        }

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new D0513_Ex04();
    }
}