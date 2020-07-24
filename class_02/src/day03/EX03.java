package day03;
/*
 	삼항연산자 문제
 		문제3]
 			정수 세개를 입력 받아서 
 			제일 큰수 부터 출력하세요.
 			
 	힌트 ] 
 		
 		삼항 연산자도 중첩해서 사용할수 있다.
 			() ? (삼항연산자) : (삼항연산자);
 */
import java.util.Scanner;
//스캐너 함수 불러오기

public class EX03 {
	public static void main(String[] args) {
		//스캐너함수를 등록
		Scanner sc = new Scanner(System.in);
		//값을 입력받을 변수에 스캐너 함수 입력
		System.out.println("첫번째 정수를 입력해주세요 : ");
		int num1 = sc.nextInt();
		System.out.println("두번째 정수를 입력해주세요 : ");
		int num2 = sc.nextInt();
		System.out.println("세번째 정수를 입력해주세요 : ");
		int num3 = sc.nextInt();
		System.out.print("입력한 숫자들중 크기가 큰 순서는 : ");
		System.out.println(num1 > num2 ? (num1 > num3 ? "(num1 = "+num1+")" + (num2 > num3 ? " > (num2 = "+num2+")" + " > (num3 = "+num3+")" : " > (num3 = "+num3+")"+" > (num2 = "+num2+")")
						: "(num3 = "+num3+")" + " > (num1 = "+num1+")" + " > (num2 = "+num2+")") 
						: (num2 > num3 ? "(num2 = "+num2+")" +(num1 > num3 ? " > (num1 = "+num1+")" + " > (num3 = "+num3+")" 
						: " > (num3 = "+num3+")" + " > (num1 = "+num1+")") : "(num3 = "+num3+")" + " > (num2 = "+num2+")" + " > (num1 = "+num1+")"));
		sc.close();
	}

}
