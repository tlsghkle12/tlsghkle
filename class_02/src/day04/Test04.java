package day04;

public class Test04 {
	public static void main(String[] args) {
		int no = (int)(Math.random() * (999 - 100 + 1) + 100);
		int num = ((no % 100 < 50) ? (no - no % 100) : ((no / 100 + 1) * 100));
		String str = no % 100 < 50 ? ((no % 100) + "를 빼야.") 
						:
					 (100 - (no % 100)) + "를 더해야 " ;
					 
		System.out.printf("랜덤하게 발생한 세자리 숫자 %3d은 %3d와 가까우므로 %9s된다", no , num,str);
	}
}
