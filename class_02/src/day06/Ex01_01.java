package day06;
/*
	반복문 문제
	
		문제 5]
			
			1
			1 2
			1 2 3
			1 2 3 4
			1 2 3 4 5
			1 2 3 4 5 6
 */
public class Ex01_01 {
	public static void main(String[] args) {
		for(int i = 1; i < 6; i++) {
			for(int j = 1; j <= i; j++) {
				
				System.out.print(""+j+"\t");
			}
			System.out.println();
		}
	}
}
