package com.javaex.practice4;

import java.util.Scanner;

// 키보드에서 정수로 된 돈의 액수를 입력 받아 50,000원권, 10,000원권, 5,000원권, 1,000원권, 500원동전,
// 100원 동전, 50원 동전, 1원 동전 각 몇 개로 변환되는지 작성하세요.
// (아래의 배열을 사용하여 코딩하세요.)
//int[] wonArray = new int[10];
//wonArray[0] = 50000;
//wonArray[1] = 10000;
//wonArray[2] = 5000;
//wonArray[3] = 1000;
//wonArray[4] = 500;
//wonArray[5] = 100;
//wonArray[6] = 50;
//wonArray[7] = 10;
//wonArray[8] = 5;
//wonArray[9] = 1;
public class Ex07 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		 // 화폐 및 동전 배열 초기화
        int[] wonArray = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};

        // 입력 받은 돈의 액수
        System.out.print("금액을 입력하세요: ");
        int money = scanner.nextInt();

        // 입력 받은 돈을 각 화폐 단위 및 동전 단위로 변환하여 출력
        for (int i = 0; i < wonArray.length; i++) {
            int count = money / wonArray[i]; // 해당 화폐 단위 및 동전 단위로 변환된 개수 계산
            money %= wonArray[i]; // 다음 화폐 단위 및 동전 단위 계산을 위해 남은 돈 갱신
         
        // 출력
           if (count > 0) {
               if (wonArray[i] >= 1000) {
                   System.out.println(wonArray[i] + "원 짜리: " + count + "장");
               } else {
                   System.out.println(wonArray[i] + "원 동전: " + count + "개");
               }
           }
       }

        scanner.close();
    }
}

		








