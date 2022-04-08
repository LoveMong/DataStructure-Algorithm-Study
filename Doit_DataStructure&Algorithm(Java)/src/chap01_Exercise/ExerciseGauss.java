package chap01_Exercise;

import java.util.Scanner;

public class ExerciseGauss {
	
	
	// 가우스공식으로 구하는 n값의 합
	public static void main(String[] args) {
		
			
	Scanner sc = new Scanner(System.in);
	
	System.out.println("n의 값을 입력해주세요.");	
	int n = sc.nextInt();	
	sc.close();
	
	int result = (1 + n) * (n / 2) + (n % 2 == 0? 0:(1 + n)/2);
	
	
	System.out.println("가우스 공식으로 구하는 n의 합은 : " + result);
	

	
	}
	
	

}
