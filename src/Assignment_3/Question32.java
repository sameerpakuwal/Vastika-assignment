package Assignment_3;

import java.util.Scanner;

public class Question32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
	int [] arr = new int[5]	;
	
	for (int i = 0; i < arr.length; i++) {
		
		System.out.println("Enter the"+i+" element: ");
		arr[i] = input.nextInt();
		
		
	}
	
	int sum = 0;
	
	for (int i = 0; i < arr.length; i++) {
		sum = sum + arr[i];
		
	}
		System.out.println("The sum of the elements in the array is "+sum);

	}

}
