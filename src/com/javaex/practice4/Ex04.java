package com.javaex.practice4;
// 다음 주어진 배열 데이터를 이용하여 3의 배수의 개수와 배수의 합을 아래와 같이 출력하는 프로그램을 작성하세요.
// int[] data = {1,3,5,8,9,11,15,19,18,20,30,33,31};
// 주어진 배열에서 3의 배수의 개수 => 6
// 주어진 배열에서 3의 배수의 합 => 108
public class Ex04 {

	public static void main(String[] args) {
		int[] data = {1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31};
		
		int count = 0;
		int sum = 0;
		
		for (int num : data) {
			if (num%3==0) {
				count++;
				sum+=num;
				
			}
		}
		System.out.println("주어진 배열에서 3의 배수의 개수 => " + count);
		System.out.println("주어진 배열에서 3의 배수의 합 => " + sum);


	} 
}
