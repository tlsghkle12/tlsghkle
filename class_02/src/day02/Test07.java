package day02;

public class Test07 {
	/* 
	  밑변이 10이고 높이가 5인 삼각형의 넓이를 기억할 변수를 만들고 초기화하세요.
	  밑변과 높이의 변수도 선언하고 초기화 하세요.
	  
	  공식 ] 
	  		삼각형의 넓이= 밑변 * 높이 * 1/2
	 */
	public static void main(String[] args) {
		int bot = 10;
		int height = 5;
		float sc = bot * height * 0.5f;
		
		System.out.println("\"삼각형의 넓이\" : " + sc +"\n\"삼각형의 밑변\" : " + bot +"\n\"삼각형의 높이\" : " + height);
	}
}
