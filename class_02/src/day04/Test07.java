package day04;

/*
 	 문제3 ]
 	 	다섯자리 숫자를 입력받아서
 	 	그 숫자가 회문수인지 아닌지 판별해서 출력하세요.
 	 	
 	 	참고 ] 
 	 		회문수란 앞으로 보나 뒤로 보나 똑같은수를 회문수라 한다
 	 		
 	 		12321 11111 13231
 */
import java.util.*;

import javax.swing.JOptionPane;
public class Test07 {
	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("다섯자리 숫자를 입력하세요");
		
		char ch = (char)str.charAt(0);
		char ch1 = (char)(str.charAt(1));
		char ch2 = (char)(str.charAt(2));
		char ch3 = (char)(str.charAt(3));
		char ch4 = (char)(str.charAt(4));
		
		System.out.println(ch == ch4 ? (ch1 == ch3 ? ("이 정수는 회문수입니다") 
							:
						("이 정수는 회문수가 아닙니다")) 
							:
						("이 정수는 회문수가 아닙니다"));
		
	}
}
