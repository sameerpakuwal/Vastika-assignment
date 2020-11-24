package Assignment_3;

import java.util.Scanner;

//36.	Write a function to find duplicate elements in an array.
public class Question36 {

	public static int[] readArray(Scanner input) {

		System.out.println("Enter the size of element: ");

		int size = input.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the element: ");
			arr[i] = input.nextInt();

		}

		System.out.println();
		System.out.println("The elements of an array are");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		return arr;
	}

	public static void duplicateArray(int[] arr) {
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					counter = 1;
					System.out.println();
					System.out.println("Duplicate elemenet detected:");
					System.out.println(arr[i]);
					counter++;
				}
			}
		}
		if (counter == 0) {
			System.out.println();
			System.out.println("No duplicate element was found.");
		}

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] arr = readArray(input);
		Question36.duplicateArray(arr);
	}

}
