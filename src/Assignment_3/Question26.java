package Assignment_3;

import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number the you want to reverse: ");
		int  n = input.nextInt();
		
		int rev = 0;
		 System.out.println("The original number is :"+n);
		 
		 while(n!=0)
		 {
			int temp = n%10;
			rev = rev*10 + temp;
			n = n/10;
			 
		 }
		 System.out.println("The reveresed number is "+rev);
		 input.close();

	}

}
