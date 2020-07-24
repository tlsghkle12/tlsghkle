package day04;
/*
  	문제 ]
  		두 수를 랜덤하게 발생시켜 각각 변수에 담고
  		첫번째 수가 두번째 수보다 크면 "양수"
  		첫번째 수가 두번째 수보다 작으면 "음수"
  		를 출력하세요
 
 */
import java.util.*;

import javax.swing.JOptionPane;

public class Ex04 {
	public static void main(String[] args) {
		
		int num1 = (int)(Math.random() * (99 - 10 + 1) + 10);
		int num2 = (int)(Math.random() * (99 - 10 + 1) + 10);
		
		String str;
		
		if(num1 >= num2) {
			str = "양수";
		}else {
			str = "음수";
		}
		
		JOptionPane.showMessageDialog(null,"첫번째 랜덤한 숫자는 " + num1 + " 이며 " + str + " 입니다");
		System.out.printf("랜덤하게 발생시킨 첫번째 정수는 %d, 두번째 정수는 %d이고 첫번째 정수는 %s 입니다",num1,num2,str);
	}
}
