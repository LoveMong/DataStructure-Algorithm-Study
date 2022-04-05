package chap01;

import java.util.Scanner;

public class SumWhile {
	
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값 : ");
		int n = sc.nextInt();
		
		sc.close();
		
		int sum = 0; // 합을 저장하는 변수 sum을 0으로 초기화
		int i = 1; // 반복을 제어하기 위한 변수 i를 1로 초기화
		
		// while : 사전 판단 반복 구조
		while(i <= n) { // i가 n이하면 반복합니다.
			
			sum += i;   // sum에 i를 더합니다.
			
			i++;        // i값을 1만큼 증가시킵니다.
			
		}
		
		System.out.println(i);
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + " 입니다.");
		
	}

}
