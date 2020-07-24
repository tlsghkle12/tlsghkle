package day04;
/*
 	
 	문제2]
 		201~500 까지의 세자리 숫자를 입력받아서
 		그 수가 300보다 크면 "300보다 큰수"
 		작으면 "300보다 작은수"
 		가 출력되게 하세요
 */
import java.util.*;

import javax.swing.JOptionPane;
public class Ex05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("201~500 까지의 세자리 정수를 입력해주세요 : ");
		int num = sc.nextInt();
		sc.close();
		String str;
		if(num > 300) {
			str = "300보다 큰수";
		}else {
			str = "300보다 작은수";
		}
		System.out.printf("입력받은 수는 %d 이고 %s 입니다",num,str );
	}
}
