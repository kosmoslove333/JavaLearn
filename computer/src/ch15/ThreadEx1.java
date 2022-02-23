package ch15;

public class ThreadEx1 extends Thread{//Thread 클래스 상속
	public ThreadEx1(String name) {//생성자
		super(name);//상위클래스의 생성자 호출
	}
	@Override// Thread class의 run()함수를 오버라이드(재정의)
	public void run() {
		for(int i=1; i<=9; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i+"\n");
		}
	
	}
	public static void main(String[] args) {
		ThreadEx1 e1=new ThreadEx1("thread 1");
		ThreadEx1 e2=new ThreadEx1("thread 2");
		ThreadEx1 e3=new ThreadEx1("thread 3");
		e1.start();//새로운 스레드가 만들어지고 run() 함수가 실행됨
		e2.start();
		e3.start();
	}

}
