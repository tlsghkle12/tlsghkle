package day06;
/*
반복문 문제
	
	문제 4]
		
		1 
		2	3
		4	5	6
		7	8	9	10
		11	12	13	14	15
		
*/
public class Ex04_01 {
	public static void main(String[] args) {
		
			for(int i = 0; i < 5 ; i++) {
			
				int num = 1;
				
				num += 1;
				
				for(int j = 0; j <= i ; j++) {
					System.out.print(""+ num +"\t");
					num++;
					
				}
				
				
				
				System.out.println();
			}
	
	}
}	
