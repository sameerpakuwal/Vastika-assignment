package Assignment_2;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int a, b, div;
	System.out.println("Enter the dividend number: ");
	a = input.nextInt();
	System.out.println("Enter the divisior number: ");
	b = input.nextInt();
	div = a/b;
	System.out.println("The division of "+a+" by "+b+" is : " +div);
	}

}
