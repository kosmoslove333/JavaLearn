package ch16;
// InnerEx1.class     InnerEx1$Inner.class

public class InnerEx1 { //외부 클래스
	static int x = 10;
	
	class Inner{ //내부 클래스
		int getX() {
			return x; // 외부 클래스의 맴버를 자유롭게 참조할 수 있음
		}
	}
	
	public static void main(String[] args) {
		System.out.println(x);
		InnerEx1 e= new InnerEx1(); //외부 클래스의 인스턴스
		InnerEx1.Inner in = e.new Inner(); //내부 클래스의 인스턴스
		System.out.println(in.getX());
	}

}
