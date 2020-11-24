package Assignment_3;

import java.util.Scanner;

//20.	Write a program to create the equivalent of a four-function calculator.
//The program to enter two integer’s numbers and an operator. 
//It then carries out the specified arithmetic operator operation: 
//addition, subtraction, multiplication or division of the two numbers. 
//Finally, it displays the result.


public class Question20 {

	public static void main(String[] args) {
		
		int a,b;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first integer number: ");
		a = input.nextInt();
		System.out.println("Enter the second integer number: ");
		b = input.nextInt();
		System.out.println("Enter the operator sign:  '/' or '*' or '+' or '-'");
		char c = input.next().charAt(0);
		
		if ( c == '+') {
			System.out.println(" You have selected to add the given numbers");
			int add = a+b;
			System.out.println("The result is "+add);
		}
		else if ( c == '-') {
			System.out.println(" You have selected to subtract the given numbers");
			int sub = a-b;
			System.out.println("The result is "+sub);
		}
		else if ( c == '*') {
			System.out.println(" You have selected to multiply the given numbers");
			int mul = a*b;
			System.out.println("The result is "+mul);
		}
		else if ( c == '/') {
			System.out.println(" You have selected to divide the given numbers");
			if (a>b) {
				if (b==0) {
					System.out.println("Cannot be solved. It is undeterminant.");
					
				}
				double div = a/b;
				System.out.println("The result is " +div);
			}
			
			
			else if (b>a) 
			
			{ if(a==0) {
					System.out.println("Cannot be solved. It is undeterminant.");
					
				}
				double div = b/a;
				System.out.println("The result is "+div );
			}
		}
	}
}

			
		
		
		
		
			

	


