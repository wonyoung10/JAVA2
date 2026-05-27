package D0527;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import D0520.D0530_Ex01;

public class D0527_Ex01 extends JFrame{
    private JLabel la = new JLabel(text:"Hello"); // "Hello" 레이블
    
    public D0527_Ex01() {
        setTitle(title:"Mouse 이벤트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.addMouseListener(new Ex95MyMouseAdapter());

        c.setLayout(mgr:null);
        la.setSize(width:50, height:20); // 레이블의 크기 50x20 설정
        la.setLocation(x:30, y:30); // 레이블의 위치 (30,30)으로 설정
        c.add(la);

        setSize(width:200, height:200);
        setVisible(b:true);
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
