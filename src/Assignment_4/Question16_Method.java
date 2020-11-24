package Assignment_4;

import java.util.Scanner;

public class Question16_Method {
	
	public static void evenOddFinder() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		int n = input.nextInt();
		if (n%2==0)
		{
			System.out.println("The number " +n+ " is even number.");
		}
		else
		{
		
			System.out.println("The number " +n+ " is odd number.");
			}
		
		
	}

	public static void main(String[] args) {
		evenOddFinder(); 
		
System.out.println("Well done!!");
	}

}
