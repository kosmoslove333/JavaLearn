package ch13;

public class Type2 {
	
	Object value;

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
	public static void main(String[] args) {
		Type2 t = new Type2();
		t.setValue("kim");
		System.out.println(t.getValue());
		t.setValue(100.5);
		System.out.println(t.getValue());;
	}
	//다른 자료형을 좀더 수월하게 출력하려면 오브젝트 자료형을 사용해줘도 되지만, 비용이 많이드는 방법

}
