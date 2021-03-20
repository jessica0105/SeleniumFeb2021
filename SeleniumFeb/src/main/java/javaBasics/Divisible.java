package javaBasics;

import javax.swing.JOptionPane;

public class Divisible {
      // leer un numero por teclado e indica si es divisible entre 2 (resto =0)
	// indicar si no lo es
	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número"));
		if (numero%2==0) {
			System.out.println("El número ingresado " + numero +  " es divisible entre 2");
		}else {
			System.out.println("El número ingresado " + numero +  " NO es divisible entre 2");
		}

	}

}
