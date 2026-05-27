package D0527;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class D0527_Ex03 extends JFrame {  // extends JFrame 추가
    public D0527_Ex03() {
        super("JCompononet의 공통 메소드 예제");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton b1 = new JButton("Magent/yellow Button");
        JButton b2 = new JButton("Disabled Button");
        JButton b3 = new JButton("getX(), getY()");
        b1.setBackground(Color.YELLOW);
        b1.setForeground(Color.MAGENTA);
        b1.setFont(new Font("Arial", Font.ITALIC, 20));
        b2.setEnabled(false);
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton) e.getSource();
                setTitle(b.getX() + "," + b.getY());  // + 연산자 추가
            }    
        });
        c.add(b1);
        c.add(b2);
        c.add(b3);
        setSize(260, 200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new D0527_Ex03();
    }
}