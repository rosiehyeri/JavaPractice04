package com.javaex.practice4;

import java.util.Scanner;

// 5개의 숫자를 키보드로 입력 받아 평균을 구하는 프로그램을 작성하세요.
public class Ex05 {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		int num1, num2, num3, num4, num5;
		
		System.out.println("첫번째 숫자: ");
		num1 = scanner.nextInt();
		System.out.println("두번째 숫자: ");
		num2 = scanner.nextInt();
		System.out.println("세번째 숫자: ");
		num3 = scanner.nextInt();
		System.out.println("네번째 숫자: ");
		num4 = scanner.nextInt();
		System.out.println("다섯번째 숫자: ");
		num5 = scanner.nextInt();
		
		double avg = ((num1 + num2 + num3+ num4 + num5)/5);
		System.out.println("평균은 " + avg + "입니다.");
		
		scanner.close();

	} 

}
