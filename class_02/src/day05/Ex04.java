package day05;
/*
 	문제 4]
 		1 - 2 + 3 - 4 + 5 - 6 + 7 .... 했을경우
 		어디까지 계산하면 100이 넘는 숫자가 발생하는지 출력하세요/
 */
public class Ex04 {
	public static void main(String[] args) {
		/*int num = 0;
		boolean bool = true;
		int no = 0;
		
		for(int i = 1; i < 100 ; i++) {
			
			if(num < 100) {
				
				if(bool == true) {
					num += i;
					bool = false;
					no++;
				}else{
					num -= i;
					bool = true;
					no++;
				}	
			}
			if(num >= 100) {
				System.out.println(no);
			}
		}
		*/
		
		int booho = -1;
		int sum = 0;
		int num = 1;
		
		for(int i = 0; true; i++) {
			booho *= -1;
			sum = sum + (booho* i);
			if(sum >= 100) {
				num = i;
				break;
			}
		}
		System.out.println("더한 값이 100 이상 되는 숫자는 "+num+" 이고 합은 "+sum+" 입니다");
	}

}
