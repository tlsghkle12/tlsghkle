package day07;

import java.util.Arrays;

/*
	1~45 까지의 숫자를 랜덤하게 6개를 관리할 배열을 5개를 관리할 배열을 만들고출력/
 */
public class Test07 {

	public static void main(String[] args) {
		int[][][] lotto = new int[2][5][6];
		
		for(int x = 0; x < lotto.length ; x++) {//int[] 크기만큼 반복
			for(int i = 0; i < lotto[x].length; i++) {//int[][]크기만큼 반복
				loop:
				for(int j = 0; j < lotto[x][i].length ; j++) {//int[][][]크기만큼 반복
					int no = (int)(Math.random() * 45 + 1);//1~45까지 랜덤숫자 no에 생성
					
					//중복검사
					for(int k = 0; k < j ; k++) {//int[][][]크기-1 만큼 반복 이유: 앞숫자들과 중복을 비교하기때문
						if(lotto[x][i][k] == no) {//랜덤생성된 숫자가 앞의 숫자들과 중복되면 다시 생성 loop:
							j--;
							continue loop;
						}
					}
					lotto[x][i][j] = no;//중복되지 않는수를 입력
				}
				//정렬한다.
				for(int l = 0 ; l < lotto[x][i].length -1 ; l++) {//앞자리숫자를 의미
					for(int m = l+1; m < lotto[x][i].length ; m++) {//뒷자리 숫자를 의미
						if(lotto[x][i][l] > lotto[x][i][m]) {//앞자리와 뒷자리비교시 앞자리가 크면
							//3개의 변수를 이용해 교차교환
							int tmp = lotto[x][i][l];
							lotto[x][i][l] = lotto[x][i][m];
							lotto[x][i][m] = tmp;
						}
					}
				}
			}
			for(int[] arr : lotto[x]) {//arr에 lotto[][] 만큼의 배열을 반복
				System.out.println(Arrays.toString(arr));//lotto[][]안에 담긴 lotto[][][]를 문자열로 출력
			}
			System.out.println("--------------------------------");//다음 3차원배열 시작
		}
	}

}
