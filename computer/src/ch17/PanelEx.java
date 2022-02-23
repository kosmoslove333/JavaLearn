package ch17;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class PanelEx extends JFrame {
	public PanelEx() {
		JPanel p=new JPanel(); //패널 생성
		p.setBackground(Color.red); //패널의 배경색상
		JButton button1 = new JButton("Button 1"); //버튼 생성
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");
		p.add(button1); //패널에 버튼 추가
		p.add(button2);
		p.add(button3);
		add(p); //프레임에 패널 추가
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	
	public static void main(String[] args) {
		new PanelEx(); //인스턴스 생성 후 생성자 호출
	}

}
