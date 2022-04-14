package chap02;

import java.util.Random;



// 배열 요소의 최댓값을 나타냅니다.(값을 난수로 생성)
public class MaxOfArrayRand {
	
	static int maxOf(int[] a) {
		
		int max = a[0];
		
		for(int i = 1; i < a.length; i++) {
			
			if(max < a[i]) {
				
				max = a[i];
				
			}
		
		}
		
		return max;		
		
	}
	
	public static void main(String[] args) {
		
		Random rand = new Random();		
		
		System.out.println("키의 최댓값을 구합니다.");
				
		int num = rand.nextInt(10); // 사람수도 난수로 결정
		System.out.println("사람 수는 : " + num + "명");
		
		int[] heigh = new int[num];
		
		for(int i = 0; i < num; i++) {
			
			heigh[i] = 100 + rand.nextInt(90); // 요소의 값을 난수로 결정 0 ~ 89 까지의 난수
			
			System.out.println("heigh[" + i + "] : " + heigh[i]);
			
		}
		
		System.out.println("최댓값은 " + maxOf(heigh) + "입니다.");
		
	}

}
