package Assignment_3;

import java.util.Scanner;

//24.	Write a program to print the factorial number of given numbers.

public class Question24 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number that you want the factorial of : ");
		int n = input.nextInt();

		long product = 1;

		for (int i = 1; i <= n; i++) {
			
			product = (product * i);
		}
		System.out.println("The factorial of the number " + n + " is " + product+".");

		input.close();
	}

}
