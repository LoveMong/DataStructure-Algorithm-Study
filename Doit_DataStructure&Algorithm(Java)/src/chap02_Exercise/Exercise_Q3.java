package chap02_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

// 배열 a의 모든 요소의 합계를 구하여 반환하는 메서드를 작성하세요.
public class Exercise_Q3 {
	
	
	static int sumOf(int[] a) {
		
		int sum = 0;
		
		for(int i = 0; i < a.length; i++) {			
			
			sum += a[i];
			
		}	
		
		return sum;
		
	}
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Random random = new Random();
		
		System.out.print("요소수 입력 : ");
		int a = Integer.parseInt(br.readLine());
		br.close();
		
		int[] num = new int[a];
		
		for(int i = 0; i < a; i++) {
			
			num[i] = random.nextInt(30);
			System.out.print(num[i] + " ");
			
		}
		
		System.out.println();
		System.out.println("배열 모든 요소의 합은 : " + sumOf(num));	
		
		
	}


}
