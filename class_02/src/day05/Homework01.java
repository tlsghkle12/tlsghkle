package day05;
/*
 	숙제 01 ]
 		
 */
public class Homework01 {
	public static void main(String[] args) {
		
		int dan;
		for(int i = 0; i <= 9 ; i++) {
			for(int j = 2; j <= 5; j++) {
				int plus = i*j;
				System.out.printf("%2d x %2d = %2d |",j,i,plus);
			}
			System.out.println();
		}
		for(int i = 0; i <= 9 ; i++) {
			for(int j = 6; j <= 9; j++) {
				int plus = i*j;
				System.out.printf("%2d x %2d = %2d |",j,i,plus);
			}
			System.out.println();
		}
	}
}
