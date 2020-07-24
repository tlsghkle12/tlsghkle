package day05;
/*
 	문제 5]
 		주사위 2개를 던질 경우 
 		두 눈의 합이 6이 되는 경우를 출력하세요.
 */
public class Ex05 {
	public static void main(String[] args) {
		int num = 0;
		
		repeat:
		for(int i = 1 ; i <= 6 ; i++) {
			for(int j = 1; j <= 6 ; j++) {
				if(i + j == 6) {
					num++;
					continue repeat;
				}
			}
		}
		System.out.println("주사위 두 개가 합이 6일 경우의 수는 "+num+"개 입니다.");
	}

		
}
