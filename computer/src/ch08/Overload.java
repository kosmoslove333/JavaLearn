package ch08;

public class Overload {
	public static void main(String[] args) {
		print(10);
		print(100.5);
		print("java");
	}

	public static void print(String string) {
		System.out.println(string);
		
	}

	public static void print(double d) {
		System.out.println(d);
		
	}

	public static void print(int i) {
		System.out.println(i);
		
	}
}
