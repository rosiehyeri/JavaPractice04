package com.javaex.practice4;
//배열을 사용하여 1~45까지의 숫자 중 임의의 6개의 숫자를 출력하세요-미니로또
//(중복체크 할 것)
public class Ex08 {

	public static void main(String[] args) {
		int[] lottoNumbers = new int[6]; // 미니로또 번호를 저장할 배열
        boolean[] isPicked = new boolean[45]; // 번호 중복 여부를 저장할 배열

        Random random = new Random();

        // 6개의 미니로또 번호 선택
        for (int i = 0; i < 6; i++) {
            int number;
            do {
                number = random.nextInt(45) + 1; // 1부터 45까지의 임의의 숫자 선택
            } while (isPicked[number - 1]); // 중복된 번호인 경우 다시 선택

            lottoNumbers[i] = number; // 선택된 번호를 배열에 저장
            isPicked[number - 1] = true; // 해당 번호를 중복되었음을 표시
        }

        // 선택된 미니로또 번호 출력
        System.out.print("선택된 미니로또 번호: ");
        for (int number : lottoNumbers) {
            System.out.print(number + " ");
        }
        

	}

}
