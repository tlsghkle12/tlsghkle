package day02;
/*
4.1년은 365.2426일이다.
	이 수치는 몇일, 몇시간 , 몇분 몇초인지 계산해서 출력하세요.
	
	힌트] 0.5일은 12시간이다.
*/
public class Test16 {
	public static void main(String[] args) {
		float day = 365.2426f;
		
		
		System.out.println(""+(int)day+"일");
		float hour = day;
		hour %= (int)day;
		hour *= 24;
		System.out.println(""+(int)hour+"시간");
		
		float min = hour;
		min %= (int)hour;
		min *= 60;
		System.out.println(""+(int)min+"분");
		
		float sec = min;
		sec %= (int)min;
		sec *= 60;
		System.out.println(""+(int)sec+"초");
		
	}
}
