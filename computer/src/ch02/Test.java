package ch02;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요:");
		int a=sc.nextInt();
		System.out.println(a%2==0 ? "짝수" : "홀수");
		sc.close();
	}

}
