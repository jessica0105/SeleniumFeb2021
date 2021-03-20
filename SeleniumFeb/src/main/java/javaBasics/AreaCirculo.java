package javaBasics;

import javax.swing.JOptionPane;

public class AreaCirculo {
/*calcular el área de un circulo, ingresa el radio del circulo por teclado
 * 
 */
	public static void main(String[] args) {
		double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el Radio"));
		double area = Math.PI*Math.pow(radio,2);
	
		System.out.println("El área del circulo es: " + area);

	}

}
