package chap02;

/*
 1,000 이하의 소수를 나열하는 프로그램
 소수 : 1과 자신의 수 외에는 나눌 수 없는 숫자
 */
public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int counter = 0;
		
		for(int n = 2; n <= 1000; n++) { // 1,000 이하의 수(n)
			
			int i;
			
			for(i = 2; i < n; i++) { // n보다 작은(n-1)의 수 중에
				
				counter++; // 나눗셈한 수 카운트
				
				if (n % i == 0) { // 나누어 떨어지면 소수가 아님(합성수)					
					
					break; // 소수면 더 이상 반복은 불필요					
					
				}				
				
			}
			
			if (n == i) { // 마지막까지 나누어떨어지지 않음(소수 출력)				
				
				System.out.println(n);
				
			}
			
		}
		
		System.out.println("나눗셈을 수행한 횟수 : " + counter);
	}

}
