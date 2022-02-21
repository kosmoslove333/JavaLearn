package ch02;

import java.util.Scanner;

public class test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수학점수를 입력해주세요 : ");
		int math = sc.nextInt();
		System.out.print("영어점수를 입력해주세요 : ");
		int eng = sc.nextInt();
		System.out.print("국어점수를 입력해주세요 : ");
		int kor = sc.nextInt();
		int total = math + eng + kor;
		double ave = total/3.0;
		System.out.println("총점 : "+total+" 평균 : "+String.format("%.1f", ave));
		sc.close();
		
	}

}
