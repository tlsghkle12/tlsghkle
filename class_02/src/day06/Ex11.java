package day06;
/*
	1	10	11	20	21
	2	9	12	19	22
	3	8	13	18	23
	4	7	14	17	24
	5	6	15	16	25
 */
public class Ex11 {
	public static void main(String[] args) {
		for(int l = 0; l < 5 ; l++) {
			int num = 0;
			for(int i = 0; i < 5 ; i++) {
					num += 1;
					System.out.print(""+num+"");
					System.out.print(" ");	
					
				
				
					
			}
			System.out.println();
			for(int i = 0; i < 5 ; i++) {
					num += 9;
					System.out.print(""+num+"");
					System.out.print(" ");
				
						
				
				
					
			}
			System.out.println();
		}
	}
}
