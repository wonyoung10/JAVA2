package D0520;

import java.awt.*;
import java.awt.event.*; // 오타 수정: awe -> awt
import javax.swing.*;

// 클래스명과 생성자명을 D0530_Ex01로 일치시켰습니다.
public class D0530_Ex01 extends JFrame { 
    public D0530_Ex01() {
        setTitle("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        
        JButton btn = new JButton("Action");
        btn.addActionListener(new Ex91MyActionListener()); // 리스너 객체 생성
        c.add(btn);
        
        setSize(250, 120);
        setVisible(true);
    }

    public static void main(String[] args) {
        new D0530_Ex01(); // 메인 메소드에서 프레임 생성
    }
}

// 독립된 클래스로 이벤트 리스너 작성
class Ex91MyActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton)e.getSource();
        
        // 버튼의 텍스트가 "Action"이면 "액션"으로, 아니면 "Action"으로 토글
        if(b.getText().equals("Action")) {
            b.setText("액션");
        } else {
            b.setText("Action");
        }
    }
}