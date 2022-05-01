package chap02_Exercise;

import java.util.Arrays;
import java.util.Random;

// 배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메서드 rcopy를 작성하시오.
public class Exercise_Q5 {
	
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		/*
			(int) Math.random() * (최댓값-최소값+1) + 최소값
	
			예시) 1 ~ 12까지의 랜덤 숫자 10가지 출력
			
			(int) (Math.random() * (12-1+1)) + 1
			
			→ (int) (Math.random() * 12) + 1
		 */		
		int n = (int) (Math.random() * 12) + 1; // 1 ~ 12까지의 랜덤 숫자 10가지 출력 
				
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i = 0; i < a.length; i++) {
			
			a[i] = random.nextInt(10);
			b[i] = random.nextInt(10);
		
		}
		
		System.out.println("배열 a : " +  Arrays.toString(a));
		System.out.println("배열 b : " +  Arrays.toString(b));
		System.out.println();
		
		rcopy(a, b);
				
		System.out.println("b의 모든 배열 요소를 a에 역순으로 복사 후 a, b의 값");
		// Arrays.toString() 메소드는 파라미터로 배열을 입력받아서, 배열에 정의된 값들을 문자열 형태로 만들어서 리턴
		System.out.println("배열 a : " +  Arrays.toString(a));
		System.out.println("배열 b : " +  Arrays.toString(b));		
		
	}
	
	
	public static void rcopy(int[] a, int[] b) { // b의 모든 배열 요소를 역순으로 a에 복사
		
		for(int i = 0; i < a.length; i++) {
			
			a[i] = b[(b.length - 1) - i];
			
		}
		
	}
	

}
