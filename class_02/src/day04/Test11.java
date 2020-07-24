package day04;
/*
 	년도를 입력하고
 	그 해가 윤년인지 아닌지 판별해서 출력하세요
 */
import java.util.*;

import javax.swing.JOptionPane;
public class Test11 {
	public static void main(String[] args) {
		String snum = JOptionPane.showInputDialog("년도를 입력하세요");
		int year = Integer.parseInt(snum);
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					System.out.println("윤년입니다.");
				}else {
					System.out.println("평년입니다.");
				}
			}else{
				System.out.println("평년입니다.");
			}
		}else {
			System.out.println("평년입니다.");
		}
	}
}
