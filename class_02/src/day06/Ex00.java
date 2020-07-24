package day06;

public class Ex00 {
	public static void main(String[] args) {
		float speed = 1.61f;
		int high = 7564;
		int time = (int)(high / speed);
		float hour = time; 
		hour /= 60f;
		System.out.println(""+hour+"");
	}
}
