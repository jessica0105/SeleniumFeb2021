package javaBasics;

import javax.swing.JOptionPane;

public class Operaciones {// open class
	
	public static void main(String[] args) {
		double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el número 1"));
		double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el número 2"));
		
		// System.out.println("La suma es: + (numero1+numero2));
		// Impresión en consola el resultado de la suma
		JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + (numero1 + numero2));

		// Impresión en consola el resultado de la resta
		JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + (numero1 - numero2));

		// Impresión en consola el resultado de la multiplicación
		JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es: " + (numero1 * numero2));

		// Impresión en consola el resultado de la división
		JOptionPane.showMessageDialog(null, "El resultado de la división es: "+ (numero1 / numero2));

	}

}// end class