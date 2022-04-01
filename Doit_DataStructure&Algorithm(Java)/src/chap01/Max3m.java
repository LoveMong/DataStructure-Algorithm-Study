package chap01;

public class Max3m {
	// 메서드를 정의할 때는 '매개변수', 메서드를 호출할 때는 '실인수'
	static int max3(int a, int b, int c) {
		
		int max = a;
		
		if (b>max) {
			
			max = b;
			
		}
		
		if (c>max) {
			
			max = c;
			
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		
		System.out.println("max3(3, 2, 1)" + "중 최댓값은? " + max3(3, 2, 1));
		System.out.println("max3(4, 4, 4)" + "중 최댓값은? " +  max3(4, 4, 4));
		System.out.println("max3(10, 2, 14)" + "중 최댓값은? " +  max3(10, 2, 14));
		System.out.println("max3(-2, -1, -3)" + "중 최댓값은? " +  max3(-2, -1, -3));
		
	}

}
