package chap01;

import java.util.Scanner;

public class ExerciseDoWhile {
	
	// a, b에 정수를 입력하고 b - a를 출력하는 프로그램 작성
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a의 값 입력");
		int a = sc.nextInt();
		int b;
		
		do {
			
			System.out.println("b의 값 입력");
						
			b = sc.nextInt();
			
				if(b < a) {
					
					System.out.println("a보다 큰 값을 입력하세요!");
				}
				
			
		} while (b < a); // 조건이 true면 반복, false면 빠져나감
		
		
		System.out.println("b - a = " + (b-a));
	
		
		
	}

}
