package day07;

import java.util.Arrays;

/*
	다섯 학생의 국어,영어,수학,코딩,총점 을 관리할 배열을 만들고.
	랜덤하게 과목 점수를 만들어서 입력하고
	총점을 계산하고
	출력.
	
	1.
		각 과목의 배열을 만들고 점수를 입력해서 배열을 완성하고
		2차원 배열로 합쳐서 처리하는 방법
	2.
		2차원 전체 배열로 처리하는 방법
	
	보너스]
		점수가 높은 사람부터 정렬해서 출력.
 */
public class Ex04 {

	public static void main(String[] args) {
		int [][] all = new int[5][5];
		for(int i = 0; i < all.length; i++) {

			for(int j = 0; j <= all[i].length - 2; j++) {
				int score = (int)(Math.random() * (100 - 1 + 1) + 1);
				all[i][j] = score;
				
				all[i][all[i].length - 1] += score;
				
			}
			System.out.println(Arrays.toString(all[i]));
		}
		System.out.println();
		for(int i = 0; i < all.length - 1; i++) {
			for(int j = i + 1 ; j < all.length ; j++) {
				if(all[i][4] > all[j][4]) {
					int[] tmp = new int[i];
					all[i] = all[j];
					all[j] = tmp;
				}
			}
		}
		for(int i = 0; i < all.length ; i++) {
			System.out.println(Arrays.toString(all[i]));
			
		}
	}
}
