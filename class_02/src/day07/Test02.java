package day07;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		
		//1부터 5까지 정수를 저장할 배열 num을 만들고 초기화 하세요
		
//		 int[] num = {1,2,3,4,5};
		 
		int[] num = new int[] {1,2,3,4,5};
		
		// 배열의 길이를 출력하세요
		System.out.println("num 의 길이 : "+num.length+"");
		
		// 배열에 저장된 세번째 데이터를 출력
		System.out.println("num 의 세번째 데이터 : "+num[2]+"");
		
		//배열의 내용 확인
		System.out.println("num : " + Arrays.toString(num));
		
		// 배열에 저장된 데이터를 하나씩 출력
		for(int i = 0; i < num.length ; i++) {
			System.out.print(num[i] + " | ");
		}
		
		System.out.println();
		System.out.println(" | ");
		for(int no : num) {
			System.out.print(no + " | "); 
		}
		System.out.println();
		System.out.println("************************");
		System.out.println();
		
		String str= "가나다라마바사";
		char[] chArr = str.toCharArray();
		System.out.println(Arrays.toString(chArr));
		for(char ch : chArr) {
			if(ch == '라') {
				continue;
			}
			if(ch == '라') {
				break;
			}
		}
		
		
	}

}
