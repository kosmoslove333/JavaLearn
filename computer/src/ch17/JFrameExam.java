package ch17;

import javax.swing.JFrame;

public class JFrameExam {
	public static void main(String[] args) { 
		JFrame f=new JFrame(); //제이프레임 인스턴스 생성
		f.setSize(500, 500); //가로,세로 사이즈
		f.setVisible(true);//화면에 표시
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //닫기버튼 누르면 프로그램 종료
		
	}

}
