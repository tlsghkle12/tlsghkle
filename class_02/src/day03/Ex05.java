package day03;

import java.util.*;
public class Ex05 {
	public static void main(String[] args) {
		// 년도 입력받을 준비
		Scanner sc = new Scanner(System.in);
		//입력 메세지 출력
		System.out.print("년도를 입력하세요");
		//입력받은 년도 변수에 기억
		int year = sc.nextInt();
		//더이상 쓸일이 없으므로 자원반환
		sc.close();
		// 윤년인지 평년인지 판별하고
		String str = (year % 4 != 0) ? "평년" : 
			( (year % 100 == 0) ? ( (year % 400 == 0) ? "윤년" : "평년" ) : "윤년" );
				System.out.printf("입력한 년도 [ %4d ]년은 %2s 입니다.", year , str);
	}
}
