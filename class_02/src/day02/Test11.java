package day02;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//scanner 클래스는 키보드로 입력하는 값을 기억하는 명령어 
		System.out.println("숫자를 입력하세요 : " );
		int no1 = sc.nextInt();
		//nextInt 란 변수에 키보드가 입력한값을 저장해주는 역
		System.out.println("입력된 숫자 :" + no1);
		// no1 을 변의 길이로 가지는 정사각형의 넓이를 구해서 출력하세요/
		//공식 ] 정사각형의 넓이 = 변의길이 * 변의길이
		int area = no1 * no1;
		System.out.println("한 변의 길이가 " + no1 + " 인 정사각형의 넓이는 " +area +"입니다.");
	}
}
