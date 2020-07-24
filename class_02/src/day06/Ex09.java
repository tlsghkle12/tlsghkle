package day06;
/*
	반복문 문제
	
		문제 ]
		
		1	2	3	4	5
		10	9	8	7	6
		11	12	13	14	15
 		20	19	18	17	16
 		21	22	23	24	25
 */
public class Ex09 {
	public static void main(String[] args) {
		int num = 0;
		boolean bool = true;
		for(int i = 0; i < 5; i++) {
			
			if(bool) {
				
				for(int j = 0; j <5; j++) {
					
					System.out.print(++num);
					
					System.out.print(" ");
					bool = false;
				}
				num += 5;
			}else {
				
				for(int j = 0; j <5; j++) {
					
					System.out.print(num);
					num--;
					System.out.print(" ");
					bool = true;
				}
				num +=5;
			}
		System.out.println();
		}
	}
}
