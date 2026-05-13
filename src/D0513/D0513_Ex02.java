package D0513;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class D0513_Ex02 extends JFrame{
    public D0513_Ex02() {
        setTitle("ContentPane과 JFrame 예제");// 프레임의 타이틀 달기
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // getContentPane()을 사용하지 않고 JFrame에 직접 설정
        getContentPane().setBackground(Color.orange); // JFrame 배경색 설정 (실제로는 contentPane에 적용됨)
        getContentPane().setLayout(new FlowLayout()); // JFrame에 직접 레이아웃 설정

        add(new JButton("OK"));
        add(new JButton("Cancel"));
        add(new JButton("Ignore"));

        setSize(300,150); // 프레임 크기 300*150 설정
        setVisible(true); // 화며에 프레임 출력
    }
    public static void main(String[] args) {
        new D0513_Ex02();
    }
}
