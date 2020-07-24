package day02;
/*
   1. 두개의 숫자를 입력받은 후 
   		두 수를 이용해서 사각형, 삼각형의 넓이를 구해서 출력해주는 프로그램을 작성하세요.
   		
   
   
   		산술 연산자를 사용해서 해결하세요
   
 */
import java.util.Scanner;

public class Test13 {
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변을 입력하세요 :");
		int no1 = sc.nextInt();
		System.out.println("높이를 입력하세요 :");
		int no2 = sc.nextInt();
		
		int squre = no1 * no2;
		float triangle = no1 * no2 * (1.0f / 2);
		
		System.out.println("사각형의 값은 :" + squre);
		System.out.println("삼각형의 값은 :" + triangle);
		
	}

}
