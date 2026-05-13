package D0513;

import java.awt.*;

import javax.swing.*;

public class D0513_Ex03 extends JFrame{
    
    public D0513_Ex03() {
        setTitle("ContentPane과 JFrame 예제");// 프레임의 타이틀 달기
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane(); // 컨텐트팬 알아내기

        //왼쪽 정렬로, 수평 간격을 30, 수직 간격을 40 픽셀로 배치ㅏㅎ는
        // FlowLayout 생성
        // getContentPane()을 사용하지 않고 JFrame에 직접 설정
        contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));

        add(new JButton("add"),BorderLayout.CENTER);
        add(new JButton("sub"),BorderLayout.NORTH);
        add(new JButton("mul"),BorderLayout.SOUTH);
        add(new JButton("div"),BorderLayout.EAST);
        add(new JButton("Calculate"),BorderLayout.WEST);

        setSize(300,200); // 프레임 크기 300*200 설정
        setVisible(true); // 화며에 프레임 출력
    }
    
    public static void main(String[] args) {
        new D0513_Ex03();
    }
}
