package Assignment_3;

public class Question37 {

	public static void main(String[] args) {

		int[][] matrixA = new int[][] { { 2, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrixB = new int[][] { { 4, 5, 9 }, { 2, 7, 8 }, { 3, 1, 9 } };
		int[][] matrixC = new int[3][3];

		for (int i = 0; i < matrixC.length; i++) {
			for (int j = 0; j < matrixC.length; j++) {
				matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
			}
		}
		System.out.println("The Matrix sum is: ");
		System.out.println();
		for (int i = 0; i < matrixC.length; i++) {
			for (int j = 0; j < matrixC.length; j++) {
				System.out.print(matrixC[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
