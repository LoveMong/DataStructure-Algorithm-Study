package chap02_Exercise;

import java.util.Random;

public class Exercise_Q2 {
	
	// 배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
		static void swap(int[] a, int idx1, int idx2) {
			
			int t = a[idx1];
			a[idx1] = a[idx2];
			a[idx2] = t;
			
		}
		
		// 배열 a의 요소를 역순으로 정렬  
		static void reverse(int[] a) {			
		
			
			for(int i = 0; i < a.length / 2; i++) {	
				
				System.out.println();

				System.out.println("a[" + i + "]과(와) " + "a[" + (a.length - i - 1) + "]를 교환합니다." );
				
				swap(a, i, a.length - i - 1);				
				
				for(int arr : a) {
					
					System.out.print(arr + " ");
					
				}
				
			}
			
		}
		
		public static void main(String[] args) {
			
			Random random = new Random();				
			
			int num = random.nextInt(10); // 요솟수			
			
			int[] x = new int[num];
			
			
			for(int i = 0; i < num; i++) {				
			
				x[i] = random.nextInt(100);	
				
				
			}			
			
			
			for(int arr : x) {
				
				System.out.print(arr + " ");				
				
			}		
			
			reverse(x); // 배열 a의 요소를 역순으로 정렬
				
			
		}


}
