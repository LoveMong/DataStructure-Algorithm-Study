package chap02;

import java.util.Random;


// 배열 요소에 값을 읽어 들여 역순으로 정렬.
public class ReverseArray {
	
	// 배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
	static void swap(int[] a, int idx1, int idx2) {
		
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
		
	}
	
	// 배열 a의 요소를 역순으로 정렬  
	static void reverse(int[] a) {
		
		for(int i = 0; i < a.length / 2; i++) {
			
			swap(a, i, a.length - i - 1);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Random random = new Random();				
		
		int num = random.nextInt(10); // 요솟수
		System.out.println("요솟수 : " + num);
		
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {				
		
			x[i] = random.nextInt(100);
			
			System.out.println("x[" + i + "] = " + x[i]);	
			
		}
		
		reverse(x); // 배열 a의 요소를 역순으로 정렬 
		
		System.out.println("요소를 역순으로 정렬했습니다.");
		for(int i = 0; i < num; i++) {
			
			System.out.println("x[" + i + "] = " + x[i]);
			
		}
	}

}
