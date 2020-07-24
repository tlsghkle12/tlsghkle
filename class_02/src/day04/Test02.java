package day04;

public class Test02 {
	public static void main(String[] args) {
		//랜덤한 문자 2개 발생
		char ch = (char)(Math.random() * ('Z' - 'A' + 1) + 'A');
		char ch1 = (char)(Math.random() * ('Z' - 'A' + 1) + 'A');
		
		//비교해서 작은 문자문자 나열해서 문자열을 만든다. [E - R] 의 형태로 만들자
		
		String str = (ch < ch1 ? ch1 + "-" + ch : ch + "-" + ch1);
		
		System.out.printf("랜덤하게 발생된 두 문자 [ %c ],[ %c ]를 순서대로 나열하면 [ %5s ] 가 된다.", ch , ch1 , str);
	}
}
