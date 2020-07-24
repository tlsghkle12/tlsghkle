package day02;
/*
2. 하나의 숫자(반지름)을 입력 받은후
	그 숫자를 이용해서 원의 넓이와 둘레를 구해서 출력해주는 프로그램을 작성하세요.
*/
import java.util.Scanner;



public class Test14 {
	public static void main(String[] args) {
		final float PI = 3.14f;
		Scanner sc = new Scanner(System.in);
		System.out.println("원의 반지름을 입력하세요 :");
		int no1 = sc.nextInt();
		
		float pus = no1 * no1 * PI;
		float tus = 2 * no1 * PI;
		System.out.println("원의 넓이는 "+pus+" 입니다");
		
		System.out.println("원의 둘래는 "+ tus +" 입니다");
		
		
		
		
	}

}
