package day04;
/*
 	문제3]
 			정수 세게를 입력받아서
 			제일 큰수부터 출력하세요
 */
import java.util.*;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 세개를 입력해주세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		String str1,str2,str3;
		sc.close();
		if(num1 > num2) {
			if(num1 > num3) {
				
				str1 = ""+num1+"";
				
				if(num2 > num3) {
					str2 = ""+num2+"";
					str3 = ""+num3+"";
				}else {
					str2 = ""+num3+"";
					str3 = ""+num2+"";
				}
			}else {
				str1 = ""+num3+"";
				str2 = ""+num1+"";
				str3 = ""+num2+"";
			}
		}else {
			if(num2 > num3) {
				
				str1 = ""+num2+"";
				
				if(num1 > num3) {
					
					str2 = ""+num1+"";
					str3 = ""+num3+"";
				}else {
					
					str2 = ""+num3+"";
					str3 = ""+num1+"";
				}
				
			}else {
				str1 = ""+num3+"";
				str2 = ""+num2+"";
				str3 = ""+num1+"";
			}
		}
		System.out.printf("정수 세게의 값은 %d, %d, %d 이고 크기가 큰 순서는 %s %s %s 입니다",num1,num2,num3,str1,str2,str3);
	}
}
