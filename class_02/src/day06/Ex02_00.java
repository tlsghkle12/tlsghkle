package day06;
/*
	문제 1]
		*
		**
		***
		****
		*****
		******
		*******
 */
import java.util.*;
public class Ex02_00 {
	public static void main(String[] args) {
		for(int i = 1; i < 7 ; i++) {
			for(int j = 1; j <= i ; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
