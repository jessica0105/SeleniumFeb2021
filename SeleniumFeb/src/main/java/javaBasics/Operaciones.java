package javaBasics;

import javax.swing.JOptionPane;

public class Operaciones {// open class
	
	public static void main(String[] args) {
		double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el n�mero 1"));
		double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el n�mero 2"));
		
		// System.out.println("La suma es: + (numero1+numero2));
		// Impresi�n en consola el resultado de la suma
		JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + (numero1 + numero2));

		// Impresi�n en consola el resultado de la resta
		JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + (numero1 - numero2));

		// Impresi�n en consola el resultado de la multiplicaci�n
		JOptionPane.showMessageDialog(null, "El resultado de la multiplicaci�n es: " + (numero1 * numero2));

		// Impresi�n en consola el resultado de la divisi�n
		JOptionPane.showMessageDialog(null, "El resultado de la divisi�n es: "+ (numero1 / numero2));

	}

}// end class