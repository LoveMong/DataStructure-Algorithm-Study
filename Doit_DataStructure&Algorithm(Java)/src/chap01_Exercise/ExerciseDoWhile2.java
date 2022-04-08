package chap01_Exercise;

import java.util.Scanner;

public class ExerciseDoWhile2 {
	
	// 정수의 자릿수 구하기.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수의 자릿수 구하기.");
		
		int num;
		int numO;
		
		do {
			
			System.out.println("정수 입력");
			
			num = sc.nextInt();			
			
			if(num < 0) {
				
				System.out.println("정수를 입력해주세요!");
				
			}
			
			numO = num;
			
		} while (num <= 0);
		
		int n = 0;
		
		
        while (num > 0) {
    	   
    	   num /= 10;
    	   
    	   n++;    	   
    	   
        }		
		
		
		System.out.println("정수 " + numO + "은 " + n + "자리입니다."  );
				
		
	}

}
