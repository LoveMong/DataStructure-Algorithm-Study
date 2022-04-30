package chap02;

import java.util.Scanner;

// 두 배열이 같은가를 판단
public class ArrayEqual {
	
	static boolean equals(int[] a, int[] b) { // 두 배열이 같은가를 판단하는 함수
		
		if (a.length != b.length) { // 배열의 길이가 같은가
			
			return false;
			
		} else {
			
			for(int i = 0; i < a.length; i++) { // 두 배열의 요소값이 같은가
				
				if (a[i] != b[i]) {
					
					return false;
					
				}
				
			}			
			
		}
		
		return true;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열 a의 요솟수 : ");
		int na = sc.nextInt();
		
		
		int[] a = new int[na];
		
		for(int i = 0; i < a.length; i++) {
			
			System.out.println("a[" + i + "] : ");
			
			a[i] = sc.nextInt();
			
		}
		
		System.out.println("배열 b의 요솟수 : ");
		int nb = sc.nextInt();
		
		int[] b = new int[nb];
		
		for(int i = 0; i < b.length; i++) {
			
			System.out.println("b[" + i + "] : ");
			
			b[i] = sc.nextInt();
			
		}
	
		sc.close();
		
		System.out.println("배열 a와 b는 " + (equals(a, b) ? "같습니다." : "같지 않습니다.")); // 3항 연산자 사용 출력
		
	}
	

}
