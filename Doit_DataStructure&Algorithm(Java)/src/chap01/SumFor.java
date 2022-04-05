package chap01;

import java.util.Scanner;


// 하나의 변수를 사용하는 반복문은 while 보다 for문을 사용하는 것이 좋다.

public class SumFor {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값 : ");
		
		int n = sc.nextInt();
		
		sc.close();
		
		int sum = 0;  // 합
		
		// for(초기화 부분; 제어식; 업데이트 부분)		
		for(int i = 1; i <= n; i++) { //i값 1부터 시작해서 n값이 될 때까지 i를 1씩증가시키며 반복
			
			sum += i; // sum에 i를 더합니다.
			
		}
		
		System.out.println("1부터 " + n + " 까지의 합은 " + sum + "입니다.");
	
		
		
	}

}
