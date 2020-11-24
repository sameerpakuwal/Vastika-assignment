package Assignment_3;

import java.util.Scanner;

// To find the number is odd or even.
public class Question16 {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the number:");
	
	int n = input.nextInt();
	if (n%2==0)
	{
		System.out.println("The number " +n+ "is even number.");
	}
	else
	{
	
		System.out.println("The number " +n+ " is odd number.");
	
	}

}
}