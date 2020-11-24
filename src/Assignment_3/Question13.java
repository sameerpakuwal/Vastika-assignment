package Assignment_3;

import javax.swing.JOptionPane;

public class Question13 {

	public static void main(String[] args) {

		String n = JOptionPane.showInputDialog("Enter the number.");
		double nn = Double.parseDouble(n);

		double a = (double) nn;

		{
			System.out.println("Enter the Negative number.");
		}
		if (a < 0 ) {
			  System.out.println("\"The Value entered is:" + a);
			}
		else
		{
			System.out.println("Enter the Negative number.");
		}
	}

}
