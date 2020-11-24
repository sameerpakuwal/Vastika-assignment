package Assignment_3;

import java.util.Scanner;

//22.	Write a program to print the table of given number.

public class Question22 {

	public static void main(String[] args) {
		
int i,result;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number that you want to print the table:");
		int a =input.nextInt();
		System.out.println("The table of "+a+" is:");
		System.out.println("\n");
		result =0;
		for (i=1; i<=10;i++)
		{
			result = i*a;
			System.out.println( +a+"\t*\t"+i+ "\t=\t" +result);
		}
		

	}

}
