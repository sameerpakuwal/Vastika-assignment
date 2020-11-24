package Assignment_3;

import java.util.Scanner;

public class Question29 {
	
	public static int factorial(int n) {
		
		int fact = 1;
		
		
		for (int i = 1; i <=n; i++) {
			
			fact = fact*i;
			} 
		return fact;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the 'n' number to calculate the value for given series :");
		int n = input.nextInt();
		
		double a = 0;
		for (int i = 1; i <=n; i++) {
			double f = Question29.factorial(i);
			a = a + (i/f) ;
			
		}
    System.out.println("The value for the calculation is :"+a);
		input.close();
	}

}
