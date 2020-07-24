package day05;
/*
 	문제 7]
 	
 		랜덤한 두 수를 입력한 후
 		두수의 최대 공약수를 구하는 프로그램을 작성하세요.
 		
 		최대 공약수의 뜻 두수를 나눌수 있는 제일 큰 수
 		
 		힌트 ]
 			최대 공약수 구하는 방법
 			
 			: 작은 수부터 시작해서 1씩 감소하면서
 				두 수가 나누어 떨어지는지 확인한다.
 */

import java.util.*;
import javax.swing.*;

public class Ex07 {
	public static void main(String[] args) {
		
		int Rnum1 = (int)(Math.random() * (99 - 10 + 1) + 10);
		int Rnum2 = (int)(Math.random() * (99 - 10 + 1) + 10);
		
		int result = 0;
		int min = 0;
		
		if(Rnum1 > Rnum2) {
			min = Rnum2;
			for(int i = min; i > 0 ; i--) {
				
					if(Rnum1 % i == 0 && Rnum2 % i == 0) {
						result = i;
						break;
					}
				
			}
		}else{
			min = Rnum1;
			for(int i = min; i > 0 ; i--) {
				
					if(Rnum1 % i == 0 && Rnum2 % i == 0) {
						result = i;	
						break;
					}
				
			}
		}
		JOptionPane.showMessageDialog(null, "랜덤한 두 수는 "+Rnum1+" "+Rnum2+"의 최대 공약수는 "+result+"입니다");
	}
}
