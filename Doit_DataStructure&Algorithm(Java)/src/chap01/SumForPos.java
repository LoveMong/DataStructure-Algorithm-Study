package chap01;

import java.util.Scanner;

public class SumForPos {
	
	
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		// do - while(조건) : n이 0보다 클 때까지 반복
		//                   일단 루프 본문을 한 번 실행한 다음 계속 반복할 것인지 판단하는 사후 판단 반복문
		do {
			
			System.out.println("n의 값 입력");
			
			n = sc.nextInt();
			
			
		} while(n <= 0);
		
		
		sc.close();
		
		
		int sum = 0;
		
		
		for(int i = 1; i <= n; i++) {
			
			sum += i;
			
		}
		
		System.out.println("1부터" + n + "까지의 합은" + sum + "입니다.");
		
	}
	

}
