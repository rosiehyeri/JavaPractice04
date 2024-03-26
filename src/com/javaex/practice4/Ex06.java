package com.javaex.practice4;
//주어진 문자열의 공백을 ‘,’(콤마) 로 변경 후 출력하세요.
//char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
public class Ex06 {

	public static void main(String[] args) {
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};

        // 문자열의 공백을 콤마로 변경하여 출력
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') {
                System.out.print(',');
            } else {
                System.out.print(c[i]);
            }
        }
	}

}
