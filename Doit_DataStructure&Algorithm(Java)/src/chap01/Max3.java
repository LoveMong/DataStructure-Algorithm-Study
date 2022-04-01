package chap01;

import java.util.Scanner;

// 3개의 정숫값을 입력하고 최대값을 구한다.
public class Max3 {
	
	// 순차적으로 실행된다. -> 순차적 구조
	// 중간 if문은 ()안의 실행 결과에 따라 프로그램 실행 흐름을 변경 -> 선택 구조
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a의 값 : "); int a = sc.nextInt();
		System.out.println("b의 값 : "); int b = sc.nextInt();
		System.out.println("c의 값 : "); int c = sc.nextInt();
		
		sc.close();
		
		int max = a; // 초기화
		
		if (b > max) {
			
			max = b; // 대입
			
		}
		
		if (c > max) {
			
			max = c; // 대입
			
		}
		
		System.out.println("최댓값은" + max + "입니다.");
		
		
	}

}
