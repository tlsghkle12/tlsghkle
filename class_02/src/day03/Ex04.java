package day03;
/*
 	년수를 입력 받아서 
 	그 해가 윤년인지 평년인지 판별해서 출력하세요
 	
 	참고 ]	
 		윤년 : 4로 나누어 떨어지고 100으로 나누어 떨어지면 안되고
 				400으로 나누어 떨어지는 해는 윤년이다.
 		
 		
 		1300년 : 평년
 		1200년 : 윤년
 */
import java.util.Scanner;
public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//연도를 입력 받고
		System.out.println("연도를 입력하세요 : ");
		int year = sc.nextInt();
		/*
		//if문으로 할시 해당 방법으로 더 간단하게 가능
		 
		if(year % 400 == 0)
		{
			System.out.println("윤년입니다.");
		}
		else
		{
			System.out.println("평년입니다.");
		}
		
		*/
		//연도를 윤년의 주기인 400으로 나눠 값이 0이라면 400의 배수이므로 윤년 0이 아니라면 400의 배수가 아니기에 평년
		System.out.println(year % 400 == 0 ? "윤년입니다" : "평년입니다");
		//스캐너 함수 닫고
		sc.close();
	}
}
