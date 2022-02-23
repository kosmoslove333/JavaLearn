package ch15;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
//  클래스             상위클래스             인터페이스
class MyFrame extends JFrame implements Runnable{
	private int x, y =50; //좌표
	private int moveX= 2,moveY =3; //움직이는 거리
	private Graphics bg; //그래픽처리 객체
	private Image offScreen; //이미지 객체
	private Dimension dim; //화면 사이즈를 저장하는 객체
	
	public MyFrame() { //생성자
		setSize(500, 500); //화면 사이즈
		setResizable(false); //화면 조절 금지
		setVisible(true); //화면 표시
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 클로즈 프로그램 종료
		
		dim=getSize(); //현재 화면의 사이즈 저장
		offScreen = createImage(dim.width,dim.height); //화면 크기만큼의 이미지 생성
		bg=offScreen.getGraphics(); //이미지 영역에 그래픽 처리를 할 객체 생성
		System.out.println("bg:"+bg);
		Thread t = new Thread(this); //새로운 스레드 생성
		t.start(); //새로운 스레드 작업 시작, 런 함수 실행
	}
	public void update(Graphics g) { //그래픽 화면을 수정하는 함수
		if(bg==null)
			bg=offScreen.getGraphics();
		bg.setColor(Color.YELLOW); //색상설정
		bg.fillRect(0, 0, getWidth(), getHeight()); //사각형 ㄱ리기
		bg.setColor(Color.GREEN);
		bg.fillOval(x, y, 30, 30); //원그리기
	}
	public void paint(Graphics g) { //그래픽 처리 함수
		super.paint(g);
		g.drawImage(offScreen, 0, 0, this); //이미지를 화면에 출력
		update(g); //그래픽 화면 수정
	}
	public void run() {
		while(true) { //인피니티 루프
			if(x>(dim.width-30)||x<0) { //좌우 벽에 맞으면
				moveX= -moveX; //방향전환
			}
			x += moveX; // x좌표 이동
			if(y>(dim.height-30)||y<30) { //상하 벽에 맞으면
				moveY=-moveY;
			}
			y+=moveY; //y 좌표이동
			repaint(); //그래픽 화면 갱신 요청
			try {
				Thread.sleep(10); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Ball {
	public static void main(String[] args) {
		new MyFrame(); //인스턴스 생성
	}

}
