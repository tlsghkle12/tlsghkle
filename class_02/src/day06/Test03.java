package day06;
/*
	7단 구구단 출력
	do while
 */
public class Test03 {
	public static void main(String[] args) {
		int gop = 1;
		do {
			System.out.println(7 + " x " + gop + " = " + (7 * gop++));

		}while(gop < 10);
	}
}
