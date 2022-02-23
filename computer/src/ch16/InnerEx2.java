package ch16;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InnerEx2 extends Frame{ //프레임상속
	public InnerEx2() { //생성자
		setSize(300,400); //화면의 가로,세로 사이즈
		setVisible(true); //화면에 표시
	}
	public static void main(String[] args) {
		InnerEx2 e = new InnerEx2();
		//현재 클래스의 인스턴스에 윈도우 닫기 버튼 클릭 효과 추가
		e.addWindowListener(new WindowAdapter() {
			//윈도우가 닫힐때
			public void windowClosing(WindowEvent e) {
				System.exit(0); //프로그램 종료
			}
		});
	}

}
