package ch12;

public class DoubleEx {
	public static void main(String[] args) {
		Double num1 = 11.5;
		double num2 = 3.5;
		double num3 = num1 / num2;
		System.out.println(num3);
		String str = "11.5";
		//스트링+숫자 => 스트링 + 스트링 => 연결
		System.out.println(str + 200);
		//스트링에서 실수추출
		System.out.println(Double.parseDouble(str) + 200);
	}
}
