package day04;

public class Test10 {
	public static void main(String[] args) {
		int num = (int)(Math.random() * (99 - 10 + 1) + 10);
		
		if(num > 50) {
			System.out.println("50보다 큰수");
		}
		else if(num == 50) {
				System.out.println("50과 같은수");
		} 
		else if(num < 50){
			System.out.println("50보다 작은수");
		}	else {
		
			}
	}
}
