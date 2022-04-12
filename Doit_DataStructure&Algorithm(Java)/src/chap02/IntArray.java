package chap02;


// 구성 요소의 자료형이 int형인 배열 (구성 요솟수는 5 : new에 의해 본체를 생성)
public class IntArray {
	
	public static void main(String[] args) {
		
		int [] a = new int[5]; // 배열 선언(배열의 구성요소는 자동으로 0으로 초기화)
		
		a[1] = 37;
		a[2] = 51;
		a[4] = a[1] * 2;
		
		// 초기화 하지 않은 a[0] , a[3]의 값은 '0' 이다.
		
		for(int i = 0; i < a.length; i++) { // 각 요소의 값을 나타냄
			
			System.out.println("a[" + i + "] = " + a[i]);
			
		}
		
	}

}
