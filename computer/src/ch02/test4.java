package ch02;

import java.util.Scanner;

public class test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요 : ");
		double a = sc.nextDouble();
		double ans = Math.PI * a * a;
		System.out.print("원의 넓이 : " +
		String.format("%.1f", ans));
		sc.close();
	}

}
