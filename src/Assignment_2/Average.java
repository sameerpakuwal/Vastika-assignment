package Assignment_2;

import java.util.Scanner;

public class Average {


	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		 
		System.out.println("Enter the 1st number: ");
		int a = input.nextInt();
		System.out.println("Enter the 2nd number: ");
		int b = input.nextInt();
	    double avg = (double) (a+b)/2;
		System.out.println("The Average of "+a+" and "+b+" is :" +avg);
	}

}
