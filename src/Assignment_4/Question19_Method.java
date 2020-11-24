package Assignment_4;

import java.util.Scanner;

public class Question19_Method {
public static void triangleCases() {
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
	public static void main(String[] args) {
		triangleCases();
		System.out.println("Well Done!!");
	}

}
