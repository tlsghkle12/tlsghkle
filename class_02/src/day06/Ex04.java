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
public class Ex04 {
	public static void main(String[] args) {
		
		int num = 0;
		for(int i = 1; i <= 5 ; i++) {
			for(int j = 0; j < i ; j++) {
				num++;
				System.out.print(""+num+"\t");
			}
			System.out.println();
		}
	}
}
