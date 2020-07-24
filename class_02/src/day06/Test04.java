package day06;
/*
	정수를 랜덤하게 발생 시키고
	숫자를 입력 받아서 
	같은 숫자가 입력될 경우 종료시키는 
	프로그램을 작성하세요
	
	단 while 문으로
 */
import java.util.*;

import javax.swing.JOptionPane;

public class Test04 {
	public static void main(String[] args) {
		// 정수 랜덤하게 발생
		
		
		//카운터 변수 생성
		boolean bool = true;
		String str = "";
		while(bool) {
			//입력받고 
			str = JOptionPane.showInputDialog("두자리 숫자 입력!");
			
			int no = (int)(Math.random() * (99 - 10 + 1) + 10);
			if(str.equals("q")){
				
				
				JOptionPane.showMessageDialog(null,"게임을 포기하겠습니다.");
				break;
			}
			int num = Integer.parseInt(str);
			
			// no 와 num 이 같은지 비교
			String msg = "같은 수";
			if(num > no) {
				msg = "큰 수";
			}else if(num < no) {
				msg = "작은 수";
			}
			JOptionPane.showMessageDialog(null,"입력한 숫자 " + num + "은 랜덤한 숫자 " + no + " 보다 " + msg + "입니다.");
			
			//탈출 조건
			if(no == num) {
				break;
			}
		}
	}
}
