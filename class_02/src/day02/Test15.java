package day02;
/*
 3.74232원을 지불을 해야한다.
 
	우리나라 화폐단위로 각 화폐단위가 몇개가 필요한지 계산해서 출력하세요.
	단, 화폐는 5만원권, 만원, 오천원, 오백원 , 백원, 오십원 , 십원 의 단위만 계산하기로 한다
*/	
public class Test15 {
	public static void main(String[] args) {
		int one = 74232;
		int two = one;
		two %= 50000;
			one /= 50000;
		System.out.println("5만원권은 "+one+" 장이 필요합니다");
		int tre = two;
		tre %= 10000;
			two /= 10000;
		System.out.println("만원권은 "+two+" 장이 필요합니다");
		int fur = tre;
		fur %= 5000;
			tre /= 5000;
		System.out.println("오천원권은 "+tre+" 장이 필요합니다");
		int fiv = fur;
		fiv %= 1000;
			fur /= 1000;
		System.out.println("천원권은 "+fur+" 장이 필요합니다");
		int six = fiv;
		six %= 500;
			fiv /= 500;
		System.out.println("오백원권은 "+fiv+" 장이 필요합니다");
		int sev = six;
		sev %= 100;
			six /= 100;
		System.out.println("백원권은 "+six+" 장이 필요합니다");
		int eig = sev;
		eig %= 10;
			sev /= 10;
		System.out.println("십원권은 "+sev+" 장이 필요합니다");

	}
	

}
