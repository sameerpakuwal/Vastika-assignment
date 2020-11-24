package Assignment_3;

import java.util.Scanner;

public class Question33 {

	public static int[] readArray(Scanner input) {

		System.out.println("Enter the size: ");
		int size = input.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {

			System.out.println("Enter Element:");
			arr[i] = input.nextInt();
		}
		System.out.println("The original array element is given as :");
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

		System.out.println("The elements of array in ascending order is as below:");
		System.out.println();
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = readArray(input);
		Question33.ascendArray(arr);
	}

}
