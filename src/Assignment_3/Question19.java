package Assignment_3;

import java.util.Scanner;

//  19.	Write a Program to accept three sides of a triangle and display 
//      which kind of triangle is formed.
public class Question19 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the length of the First side of the triangle:");
		double a = input.nextDouble();
		System.out.println("Enter the length of the Second side of the triangle:");
		double b = input.nextDouble();
		System.out.println("Enter the length of the Third side of the triangle:");
		double c = input.nextDouble();

		if ((a == b) && (b == c)) 
		{
			System.out.println("This is an Equilateral triangle. ");
		} else if ((a == b) || (b == c) || (c == a))
		{
			System.out.println("This is an Isosceles trianle. ");
		} else
			System.out.println("This is a Scalene trianle. ");

	}

}
