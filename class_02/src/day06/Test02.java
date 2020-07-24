package day06;

/*
	7단 구구단을 출력하세요
	while 문을 사용해서 처리할것/
 */
public class Test02 {
	public static void main(String[] args) {
		// 변수부터 만들고.
		/*
		int gop = 1;
		while(gop < 10) {
			System.out.println(7 + " x " + gop + " = " + (7 * gop));
			++gop;
		}
		*/
		int gop = 1;
		while(gop < 10) {
			System.out.println(7 + " x " + gop + " = " + (7 * gop++));
		}
	}
}
