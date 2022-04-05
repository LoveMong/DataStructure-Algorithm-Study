package chap01;

import java.util.Scanner;

public class ExerciseFor {
	
	//n이 3이면 '1 + 2 + 3 = 6'로 출력하는 프로그램 작성
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("n의 값을 입력해주세요.");
		int n = sc.nextInt();
		
		sc.close();
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			
			sum += i;
			
			if(i < 2) {
				
				System.out.print(i);
				
			} else {
			
			System.out.print(" + " + i);
			
			}
			
		}
		
		System.out.print(" = " + sum);
		
	}
	
	

}
