package day05;
/*
 	예제 3]
 		1부터 10까지 합을 구해서 출력하세요.
 		단, for 명령으로 처리하세요.
 */
public class Ex03 {
	public static void main(String[] args) {
		int num = 10;
		int no = 0;
		for(int i = 0; i < 10 ; i++) {
			num -= i;
			no += num;
			num = 10;
		}
		System.out.println(no);
	}

}
