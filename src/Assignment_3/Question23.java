package Assignment_3;

import java.util.Iterator;
import java.util.Scanner;

//23.	Write a Program to sum 1 to nth natural numbers.
public class Question23 {

	public static void main(String[] args) {

		// using formulae

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the natural number tht you want to get the sum up to:");
		int n = input.nextInt();
//		int sum = ((n*(n+1))/2);
//		System.out.println("The sum of the natural number up to " +n+ " is "+sum);
//			

		// using for loop

		int sum = 0;

		for (int j = 0; j <= n; j++)

		{
			sum = sum + j;
		}
		
		System.out.println("The sum of the natural number up to " +n+ " is "+sum);
	}

}
