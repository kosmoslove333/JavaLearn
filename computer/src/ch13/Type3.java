package ch13;

public class Type3<T> { //<자료형>
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public static void main(String[] args) {
		Type3<String> t = new Type3<String>();
		t.setT("김지환");
		System.out.println(t.getT());
		Type3<Integer> t2= new Type3<Integer>();
		t2.setT(200);
		System.out.println(t2.getT());
		
	}

}
