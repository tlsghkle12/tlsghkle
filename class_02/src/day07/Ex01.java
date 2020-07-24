package day07;
/*
	문제 1]
		
		'A' ~ 'J' 대문자를 랜덤하게 100개 발생시켜서
		각 문자가 몇번씩 발생되는지 
		그래프 형태로 출력하세요.
		
		예 ]
		
			A(5) : *****
			B(3) : ***
			
		힌트 ]
		
			각문자의 카운트를 기억할 배열을 만든다.
			랜덤하게 발생시킨 문자가 나올때마다 해당문자의 카운트만 1증가시킨다.
 */
public class Ex01 {

	public static void main(String[] args) {
		
		
		
		int[] num = new int[10];
		
		char[] chArr = new char[100];
		for(int i = 0; i < chArr.length; i++) {//chArr배열의 길이만큼 반복하는 for문
			
			chArr[i] = (char)(Math.random() *('J' - 'A' + 1) +'A');//chArr[i]에 'J' 부터 'A' 까지 랜덤발생
			
			for(int j = 0; j < num.length; j++) {// 'J' 부터 'A' 까지의 길이 만큼 반복
				if(chArr[i] == (char)('A' + j)) {// chArr배열 i 번째에 같은 문자가 될때 num[j]에 +1한다
					num[j] += 1;
				}
			}
		}//각 대문자 알파벳이 몇번 반복 되었는지 카운트 완료 이제 출력 
		
		for(int i = 0; i < num.length ; i++) {//num의 크기 만큼 반복 
			
			char ch = (char)('A' + i);//시스템에 대문자 알파벳을 출력하기위해 생성
			System.out.printf(" %c (%2d) : ",ch,num[i]);//어떤 문자가 어떤수만큼 랜덤생성되었는지 출력
			
			int cnt = num[i]; // cnt = 출현 빈도수 num[i]의 카운트 값
			// 출현 빈도수만큼 반복
			for(int j = 0 ; j < cnt ; j++) {
				System.out.print("*");
			}
			
			/*
				복잡한 코딩으로 알아보기 어렵다 더욱 간단하게 만들것
			for(int no = 0; no < num[i]; no++) { // i 번째 숫자 불러오기
				for(int j = 0 ; j < no; j++) {
					System.out.print("*");
				}
			}
			 */
			System.out.println();//다음줄
		}
	}
}
