package day03;
/*
 	문제 2]
 	세자리 숫자를 입력받아서
 	그 수가 300보다 크면 "300보다 큰수"
 	작으면 "300보다 작은수"
 	가 출력되게 하세요.
 */
import java.util.Scanner;
public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("세자리 숫자를 입력해주세요 : ");
		int num1 = sc.nextInt();
		System.out.println(num1 > 300 ? "300보다 큰수" : "300보다 작은수");
		sc.close();
	}
}
