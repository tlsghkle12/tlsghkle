package day03;
/*
 	문제 6]
 		게시물을 게시판에 붙이는데 
 		하나의 게시판에는 게시물을 15개를 붙일 수 있다.
 		게시물의 갯수를 랜덤하게 입력한 후 (Scanner 이용)
 		몇개의 게시판이 필요한지 계산해서 출력하는
 		프로그램을 작성하시오
 */

public class Ex07 {
	public static void main(String[] args) {
		int num = (int)(Math.random() * (999 - 0 + 1));
		System.out.println((num % 15 == 0) ? ((num == 0 ? ("게시판을 1개 만들수 있습니다") : ("게시판을 "+num / 15+" 개 만들수 있습니다") )) : 
						   (num > 15) ? "게시판을 "+((num / 15) + 1)+"개 만들수 있습니다" : 
						   "게시판을 1개 만들수 있습니다");
		

		
	}
}
