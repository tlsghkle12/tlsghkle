package day05;
/*
 	과제 2]
 		1부터 100 사이의 소수를 모두 출력하세요.
 		
 		소수 : 1과 자기자신 이외의 수로 나눌 수 없는 수.
 */
public class Homework02 {
	public static void main(String[] args) {
		int num = 0;
		loop:
		// 1은 모든 수에서 나누어지니 2부터 시작
		for(int i = 2 ; i <= 200 ; i++) {
			//모든 숫자는 나눌값과 나누어질값이 같으면 나누어지므로 소수를 구분할수 없기에 같은값 이상은 쓰지 않음
			for(int j = 2; j < i; j++) {
				// 1 과 자기자신 이외의 수로 나누어지면 소수가 아니므로 라벨을 이용해 넘김
				if(i % j == 0) {
					continue loop;
				}
				
			}
			System.out.println("이 수는 소수입니다 : " + i + "");
		}
	}
}
