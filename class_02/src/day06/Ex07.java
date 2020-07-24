package day06;
/*
		*
	   ***
	  *****
	 *******
	*********
	
	for(int k = 5; k > i ; k--) {
				System.out.print("**");
			}
	
 */
public class Ex07 {
	public static void main(String[] args) {
			
		for(int i = 5; i > 0 ; i--) {
			for(int j = 0; j < 10 ; j++) {
				
				if(i <= j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}
}

