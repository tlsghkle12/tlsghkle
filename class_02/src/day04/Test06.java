package day04;
/*
 	문제 2]
 		랜덤하게 다섯자리 숫자를 만들고
 		각 자리의 숫자의 합을 구해서 출력해주는 프로그램을 작성하세요.
 		
 		12345
 			==> 1 + 2 + 3 + 4 + 5 를 합한값
 */
public class Test06 {
	public static void main(String[] args) {
		
		int num1 = (int)(Math.random() * (99999 - 10000 + 1) + 10000);
		
		int no1 = (num1 / 10000 * 10000);
		int no2 = (num1 / 1000 * 1000);
		int no3 = (num1 / 100 * 100);
		int no4 = (num1 / 10 * 10);
		int no5 = (num1 / 1 * 1);
		
		int num = (no1 / 10000) + ((no2 - no1) / 1000) + ((no3 - no2) / 100) + ((no4 - no3) / 10) + (no5 - no4 / 1);
		
		System.out.printf("랜덤한 각 자리 수의 합산은 : %2d 입니다", num);
	}
}