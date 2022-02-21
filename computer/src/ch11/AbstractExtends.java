package ch11;

public class AbstractExtends extends Abstract {

	@Override
	void method1() {
		System.out.println("완성된 코");

	}
	public static void main(String[] args) {
		AbstractExtends ex=new AbstractExtends();
		ex.method1();
		ex.method2();
	}

}
