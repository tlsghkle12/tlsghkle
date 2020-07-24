package day03;

import java.util.Scanner;
/*
문제 ]
	두 수를 입력 받아서 각각 변수에 담고
	첫번째 수가 두번째 수보다 크거나 같으면 "양수"
	첫번째 수가 두번째 수보다 작거나 같으면 "음수"
	를 출력하세요
*/
public class Ex01 {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("첫번째 숫자를 입력하세요 : ");
	int num1 = sc.nextInt();
	System.out.println("두번째 숫자를 입력하세요 : ");
	int num2 = sc.nextInt();
	
	System.out.println(num1>=num2 ? "양수" : "음수");
	sc.close();
	}
}
