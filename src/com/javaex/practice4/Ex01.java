package com.javaex.practice4;
//Ex01 아래의 코드를 실행하면 출력결과에 오류가 발생한다. 오류 수정 후 출력결과를 예상하고 코드로
//확인해 보세요.
public class Ex01 {

	public static void main(String[] args) {
		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
//		for (int i = 0; i <= intArray.length; i++) {    //for 루프에서 배열의 인덱스를 intArray.length까지 접근하려 하지만, 
														//배열의 인덱스는 0부터 length - 1까지입니다. 따라서 <= 연산자를 사용하는 것은 잘못된 접근입니다.
		for (int i = 0; i < intArray.length; i++) { 	//로 수정
			result = result + intArray[i];
		}
		System.out.println(result);

	}

}
