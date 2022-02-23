package ch13;

public class Type1 {
	int value;
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public static void main(String[] args) {
		Type1 t = new Type1();
		t.setValue(100);
		System.out.println(t.getValue());
	}
	//다른 값을 주려면 여러 자료형을 만들어 줄 필요가 있다

}
