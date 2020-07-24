package day05;

import java.util.*;

import javax.swing.JOptionPane;

//지역번호를 입력하면 지역을 출력해주는 프로그램을 만들어보자.
public class Test01 {
	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("지역번호를 입력하세요");
		
		String Social = "";
		
		switch(str) {
		case "02" :
			Social = "서울";
			break;
		case "031" :
			Social = "경기";
			break;
		case "032" :
			Social = "인천";
			break;
		case "041" :
			Social = "충남";
			break;
		case "051" :
			Social = "부산";
			break;
		
		default :
			Social = "핸드폰";
		}
		
		JOptionPane.showMessageDialog(null,"입력한 지역번호 [ "+ str +" ]은 " + Social + " 입니다");
		
	}
}
