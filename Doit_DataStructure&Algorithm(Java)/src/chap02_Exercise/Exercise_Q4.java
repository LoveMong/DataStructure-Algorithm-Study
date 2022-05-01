package chap02_Exercise;

import java.util.Arrays;
import java.util.Random;

// 배열 b의 모든 요소를 배열 a에 복사하는 메서드 copy를 작성하시오.
public class Exercise_Q4 {
	
	
	public static void main(String[] args) {
		
		Random random = new Random();
		int n = random.nextInt(5);
		
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i = 0; i < a.length; i++) {
			
			a[i] = random.nextInt(10);
			b[i] = random.nextInt(10);
		
		}
		
		System.out.println("배열 a : " +  Arrays.toString(a));
		System.out.println("배열 b : " +  Arrays.toString(b));
		System.out.println();
		
		copy(a, b);
				
		System.out.println("b의 모든 배열 요소를 a에 복사 후 a, b의 값");
		// Arrays.toString() 메소드는 파라미터로 배열을 입력받아서, 배열에 정의된 값들을 문자열 형태로 만들어서 리턴
		System.out.println("배열 a : " +  Arrays.toString(a));
		System.out.println("배열 b : " +  Arrays.toString(b));		
		
	}
	
	
	public static void copy(int[] a, int[] b) { // b의 모든 배열 요소를 a에 복사
		
		for(int i = 0; i < a.length; i++) {
			
			a[i] = b[i];
			
		}
		
	}
	

}
