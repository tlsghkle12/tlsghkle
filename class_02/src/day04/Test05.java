package day04;
/*
 	1.랜덤하게 두자리 숫자를 발생시키고
 	키보드로 두자리 숫자를 입력하면
 	발생된 숫자보다 입력한 숫자가 큰 수인지 아닌지 판별해주는 프로그램을 작성하세요
 	
 	2.심화 ]
 		입력한 수와 차는 얼마인지 같이 출력하도록 하세요.
 */
import java.util.*;
public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두자리 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		sc.close();
		int num2 = (int)(Math.random() * (99 - 1 + 1 + 1));
		
		System.out.printf(num1 > num2 ? ("입력하신 숫자가 더 크며 그 차는 "+(num1 - num2)+"입니다.") 
				:
					("입력하신 숫자가 더 작으며 그 차는 "+(num2 - num1)+" ") );
	}
}
