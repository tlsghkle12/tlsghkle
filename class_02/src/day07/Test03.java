package day07;

import java.util.Arrays;

/*
	'a' 부터 시작하는 문자 10개를 저장하는 배열을 만들고
	출력하는 프로그램을 작성하세요.
 */
public class Test03 {

	public static void main(String[] args) {
		char[] ch = new char[10];
		//문자들을 관리할 변수 만들고
		
		//데이터 추가
		for(int i = 0; i < 10; i++) {
			char chArr = (char)('a' + i);
			ch[i] = chArr;
		}
		//배열 확인
		System.out.println(Arrays.toString(ch));
		
		// 하나씩 꺼내서 출력
		int i = 0;
		while(i < 10) {
			System.out.println(ch[i++]);
		}
		System.out.println();
		for(int j = 0; j < 30; j++) {
			System.out.print("-");
		}
		System.out.println();
		//향상된 for 명령으로 하나씩 출력
		for(char chArr : ch) {
			System.out.print(chArr + " | ");
		}
	}

}
