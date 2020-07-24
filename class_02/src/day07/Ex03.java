package day07;
/*
	정수 5개를 저장할 배열 3개를 만들어서
	첫번째 배열에는 랜덤하게 사각형의 가로의 길이를 만들어서 기억시키고
	두번째 배열에는 랜덤하게 사각형의 세로의 길이를 만들어서 기억시키고
	세번째 배열에는 랜덤하게 만든 배열의 각 인덱스의 가로 세로의 길이로 면적을 구해서
	저장할 배열을 만들고 출력하세요/
	
	출력형식 :
		
		첫번째 사각형 : 가로 - XX | 세로 - XX | 넓이 - XXX
		두번째 사각형 : 가로 - XX | 세로 - XX | 넓이 - XXX
		세번째 사각형 : 가로 - XX | 세로 - XX | 넓이 - XXX
		네번째 사각형 : 가로 - XX | 세로 - XX | 넓이 - XXX
		다섯번째 사각형 : 가로 - XX | 세로 - XX | 넓이 - XXX
	
 */
public class Ex03 {

	public static void main(String[] args) {
		int[] garo = new int[5];
		int[] sero = new int[5];
		int[] area = new int[5];
		
		for(int i = 0; i < 5 ; i++) {
				String str[] = new String[] {"첫","두","세","네","다섯"};
				int no1 = (int)(Math.random() * 99 + 1);
				int no2 = (int)(Math.random() * 99 + 1);
				int no3 = no1 * no2;
				
				garo[i] = no1;
				sero[i] = no2;
				area[i] = no3;
				System.out.printf("%s 번째 사각형 : ",str[i]);
				System.out.printf("가로 - %2d | ",garo[i]);
				System.out.printf("세로 - %2d | ",sero[i]);
				System.out.printf("넓이 - %3d ",area[i]);
				System.out.println();
			
		}
	}

}
