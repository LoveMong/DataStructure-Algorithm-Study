package chap01_Exercise;

import java.util.Scanner;

public class Exercise_Q15 {
	
	public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		do {
			
			System.out.println("단 수 입력");
			
			n = sc.nextInt();
			
		} while (n <= 0);
		
		
		sc.close();
		
		triangleLB(n);
		triangleLU(n);
		triangleRU(n);
		triangleRB(n);
		
		
	}
	
	// 왼쪽 아래가 직각인 이등변 삼각형 출력
	static void triangleLB(int n) {
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= i; j++) { // i개의 '*'를 나타냄
				
				System.out.print('*');
				
			}
			
			System.out.println();
			
		}
		
	}

	// 왼쪽 위가 직각인 이등변 삼각형 출력
	static void triangleLU(int n) {
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= n - i + 1; j++) { // i - 1 + 1 개의 '*'를 나타냄
				
				System.out.print('*');
				
			}
			
			System.out.println();	
		
		}
		
	}
	
	// 오른쪽 위가 직각인 이등변 삼각형 출력
	static void triangleRU(int n) {
		
		for (int i = 1; i <= n; i++) { // i행 (i = 1, 2, … ,n)
			
			for (int j = 1; j <= i - 1; j++) { // i-1개의 ' '를 나타냄
							
				System.out.print(' ');
				
			}
			
			for (int j = 1; j <= n - i + 1; j++) { 	// n-i+1개의 '*'를 나타냄
			
				System.out.print('*');
						
			}
			
			System.out.println();					// 개행(줄변환)
		}
	
		
	}
	
	// 오른쪽 아래가 직각인 이등변 삼각형 출력
	static void triangleRB(int n) {
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= n - i; j++) {// n - i개의 ' '를 나타냄
				
				System.out.print(" ");
				
			}
			
			for(int j = 1; j <= i; j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		
		
	}
	

}
