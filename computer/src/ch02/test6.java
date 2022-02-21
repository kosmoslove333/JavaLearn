package ch02;

import java.util.Scanner;

public class test6 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("년도를입력하세요");
		int year = sc.nextInt();
		if( year%4 == 0 && year%100 !=0 || year%400 == 0 ){System.out.println("윤년입니다.");}
		else {System.out.println("평년입니다.");
		sc.close();
	}

}}
