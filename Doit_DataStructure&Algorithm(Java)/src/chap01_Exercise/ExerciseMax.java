package chap01_Exercise;

public class ExerciseMax {
	
	static int min3(int a, int b, int c) {
		
		int min = a;
		
		if (b < min) {
			
			min = b;
			
		}
		
		if (c < min) {
			
			min = c;
			
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Min3(1, 2, 3)" + "최솟값은?" + min3(1, 2, 3));
		System.out.println("Min3(4, 4, 2" + "최솟값은?" + min3(4, 4, 2));
		System.out.println("Min3(-2, 4, -1" + "최솟값은?" + min3(-2, 4, -1));
		
	}

}
