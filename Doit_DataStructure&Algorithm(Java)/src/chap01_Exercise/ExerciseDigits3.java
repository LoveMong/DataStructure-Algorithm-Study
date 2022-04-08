package chap01_Exercise;

import java.util.Scanner;

public class ExerciseDigits3 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단수 입력 : ");
		
		int star = sc.nextInt();
		
		for(int i = 1; i <= star; i++) {
			
			for(int j = 1; j <= star; j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		
	}

}
