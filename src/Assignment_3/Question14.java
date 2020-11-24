package Assignment_3;
//14.	Write a program to relate two integers entered
//      by the user using = =or > or < sign.

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		double n1 = input.nextDouble();
		System.out.println("Enter the second number: ");
		double n2 = input.nextDouble();
		
		if (n1>n2)
			System.out.println(+n1+" is greater than " +n2);
		
		if (n1<n2)
		
			System.out.println(+n2+" is greater than " +n1);
		
		if (n1==n2)
			System.out.println(+n1+" is equal to " +n2);
		
		
	}

}
