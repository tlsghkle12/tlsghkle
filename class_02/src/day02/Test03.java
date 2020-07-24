package day02;

public class Test03 {
	public static void main(String[] args) {
		new Test02().toPrint();
		//.은 소속(ex Test02 소속의 toPrint를 호출할때 사용)을 밝혀줄때 사용한다.
		
		Test03_01 t01 = new Test03_01();
		Test03_02 t02 = new Test03_02();
		//t01 이라는 변수에 Tetst03_01 이라는 클래스의 주소를 입력시키는 방법
		
		System.out.println("Tets03_01.no : " + t01.no);
		System.out.println("Test03_02.no : " + t02.no);
		
	}

}
class Test03_01{
	int no = 10;
}

class Test03_02{
	int no = 20;
}