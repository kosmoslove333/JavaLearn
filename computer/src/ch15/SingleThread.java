package ch15;

public class SingleThread {
	void print() {
		//현재 실행중인 스레드의 이름
		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		//클래스를 사용하기 위해 인스턴스 생성
		SingleThread t= new SingleThread();
		//순서대로 실행됨 - single thread
		t.print();
		t.print();
	}

}
