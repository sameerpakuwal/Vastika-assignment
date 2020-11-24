package Assignment_3;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number between 0 to 128: ");
		
		int n = input.nextInt();
		
		
		
		if (n>=0 && n<=128)
			
		{
			char c = (char)n;

			System.out.println(" The ASCII code of " +n+" is: "+c);
			
		}
		
		else {
			System.out.println("Enter the valid number inside the range");
		}
		
	
		
		
		
		
	}

}
