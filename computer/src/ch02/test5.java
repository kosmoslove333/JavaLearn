package ch02;

import java.util.Scanner;

public class test5 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.print("출생년도를 입력하세요 : ");
		int year = sc.nextInt();
		int age = 2022-year;
		System.out.println(name+"님의 나이는 만 "+age+"세 입니다."
				);
		sc.close();
	}

}
