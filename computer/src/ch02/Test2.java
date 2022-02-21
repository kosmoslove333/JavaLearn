package ch02;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("금액을 입력하세요:");
		int money = sc.nextInt();
		System.out.println(money < 30000 ? "배송료 :3000원" : "배송료 :0원");
		sc.close();
	}
}
