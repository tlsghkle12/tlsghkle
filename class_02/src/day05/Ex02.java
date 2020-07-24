package day05;
/*
 	예제 2]
 		5자리 숫자를 입력받아서
 		그 숫자가 회문수인지 아닌지 판별하세요.
 		
 		단, for반복문을 사용해서 처리하세요.
 */
import java.util.*;

import javax.swing.JOptionPane;

public class Ex02 {
	public static void main(String[] args) {
		/*
		 문자열로 비교해서 구하는 방법 
		 
		String Sno = JOptionPane.showInputDialog("5자리 정수를 입력하세요.");
		
		//참고] 문자열의 길이를 반환해주는 함수 : length()
		
		String total = "";
		int len = Sno.length();
		for(int i = 0; i < Sno.length(); i++) {
			total += Sno.charAt(len - 1 - i);
		}
		
		// 만들어진 문자열을 비교
		boolean bool = Sno.equals(total);
		
		if(bool == true) {
			System.out.println("입력한 숫자 " + Sno + " 는 회문수 입니다.");
		}else
		System.out.println("입력한 숫자 " + Sno + " 는 회문수가 아닙니다.");
		
		*/
		//정수로 비교하는 방법
		String Sno = JOptionPane.showInputDialog("5자리 정수를 입력하세요.");
		//문자열을 정수로 형변환
		int no = Integer.parseInt(Sno);
		
		int tmp = no;
		// 역순 숫자 기억할 변수
		int result = 0;
		//반복해서 숫자를 만든다
		for(int i = 0; i < Sno.length() ; i++) {
			result = result * 10 + (tmp % 10);
			tmp /= 10;
		}
		
		String msg = "회문수가 아니다.";
		
		if(no == result) msg = "회문수다.";
		
		JOptionPane.showMessageDialog(null,"입력한 숫자 " + no + "은 " +msg + " ");
		
		
	}

}
