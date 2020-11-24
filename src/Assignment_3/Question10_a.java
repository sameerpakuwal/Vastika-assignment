package Assignment_3;

import java.util.Scanner;

public class Question10_a {

	public static void main(String[] args) {
		
		//Question10.a
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter initial velocity U: ");
		double u = input.nextDouble();
		System.out.println("enter time T: ");
		double t = input.nextDouble();
		System.out.println("enter accleration A: ");
		double ac = input.nextDouble();
		
		double s = (u*t)+(0.5*ac*Math.pow(2, t));
		
		System.out.println("The distance travelled is " +s+"m");
		
		input.close();
		
		
		
	

	}

}
