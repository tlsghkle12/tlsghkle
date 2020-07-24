package day07;

import java.util.Arrays;

/*
	1~45 까지의 숫자 여섯개를 저장할 배열을 만들고 오름차순 정렬하세요/
 	중복 숫자는 없는것으로 한다.
 */
public class Test06 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		int[][] full = new int[5][6];
			for(int loof = 0; loof < 10; loof++) {
				if(loof%5==0) {
					System.out.println("--------------------------");
				}
				loop:
				for(int i = 0; i < 6 ; i++) {
					//반복해서 숫자 만들기
					int no = (int)(Math.random() * 45 + 1);
				
					//중복된 숫자가 있는지 검사/
					for(int j = 0; j < i; j++) {
						if(lotto[j] == no) {
							--i;
							continue loop;
						}
					}
					lotto[i] = no;
					//이경우는 중복된 숫자가 없는 경우이므로 배열에 추가해준다.
				}
				
				
				for(int i = 0 ; i < lotto.length ; i++) {
					
					for(int j = i + 1; j < lotto.length; j++) {
						if(lotto[i] > lotto[j]) {
							int tmp = 0;
							tmp = lotto[i];
							lotto[i] = lotto[j];
							lotto[j] = tmp;
						}
					}
				}
				
				//내용확인
				System.out.println(Arrays.toString(lotto));
			}
	}

}
