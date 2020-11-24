package Assignment_3;

import java.util.Scanner;

// to print the second largest number in an given array

public class Question35 {

	public static int[] readArray(Scanner input) {

		System.out.println("Enter the size of an array: ");
		int size = input.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element: ");
			arr[i] = input.nextInt();
		}

		System.out.println("The elements of an array are as below: ");
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		return arr;
	}

	public static void ascendArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("The second largest element in an array is: ");
		System.out.println(arr[arr.length - 2]);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = readArray(input);
		Question35.ascendArray(arr);

	}

}
