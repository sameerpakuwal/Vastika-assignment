package Assignment_3;

import java.util.Scanner;

//>>>>>	Write a program to reverse the element of an array.
public class Question34 {

	public static int[] readArray(Scanner input) {
		System.out.println("Enter the size of array: ");
		int size = input.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element: ");
			arr[i] = input.nextInt();
		}

		return arr;
	}
	
	public static void printArray(int [] arr ) {
		
		System.out.println("The elements of an array are as below: ");
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i]+" ");			
		}
		System.out.println();	
	}
	
	public static void reverseArray(int [] arr) {
		
		System.out.println("The elements of an array in reverse order is :");
		
		for (int i = arr.length-1; i >= 0; i--) {			
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = readArray(input);
		Question34.printArray(arr);
		Question34.reverseArray(arr);
	}

}
