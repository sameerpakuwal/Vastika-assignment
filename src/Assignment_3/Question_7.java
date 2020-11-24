package Assignment_3;

import javax.swing.JOptionPane;

//7.	Write a program that reads the radius and length of a cylinder and computes volume.
public class Question_7 {

	public static void main(String[] args) {
		final double PI = Math.PI;
		
		String message = "Calculation of the volume of cylinder";
		JOptionPane.showMessageDialog(null, message);
		
		String r = JOptionPane.showInputDialog("Enter the radius of the cylinder");
		double rr = Double.parseDouble(r);
		String l = JOptionPane.showInputDialog("Enter the height of the cylinder");
		double ll = Double.parseDouble(l);
		
		double volumeOfCylinder = PI * Math.pow(2,rr) * ll;
		JOptionPane.showMessageDialog(null, +volumeOfCylinder);
		
	
	}

}
