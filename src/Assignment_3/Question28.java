package Assignment_3;

import java.util.Scanner;



public class Question28 {

	public static boolean isPrimeNumber(int n) {

		boolean isPrime   = true;

		for (int i = 2; i <= n/2; i++) {

			if (n % i == 0) {
				isPrime = false;
			}

		}
		return isPrime;

	}
	
	public static void firstNthPrime(int n) {
		 
		for (int i= 2; i <=n; i++) {
			
			 if(isPrimeNumber(i)) {
				 System.out.print(i+" ");
			 }
		}	
	}
	
	public static void allPrimebetween( int start, int end) {
		
		for (int i= start; i <=end; i++) {
			
			 if(isPrimeNumber(i)) {
				 System.out.print(i+" ");
			 }
		}	
		
		
		
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to find if it is a prime number:  ");
		int n = input.nextInt();
		boolean isPrime = Question28.isPrimeNumber(n);

		if (isPrime)
		{
			System.out.println("Number "+n+" is a  prime number.");
		} 
		else 
		{
			System.out.println("Number "+n+" is  NOT a  prime number.");
		}
		
		
		System.out.println("Enter the number to find if it is a prime number:  ");
		int n2 = input.nextInt();
		Question28.firstNthPrime(n2);
		
		System.out.println("Enter the start number to print prime numbers:  ");	
		int start = input.nextInt();
		System.out.println("Enter the end number to print prime numbers upto:  ");	
		int end = input.nextInt();
		
		Question28.allPrimebetween(start, end);
	}

}
