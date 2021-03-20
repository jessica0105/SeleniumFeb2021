package javaBasics;
import javax.swing.JOptionPane;

public class ArregloString {

	public static void main(String[] args) {
		// EJERCICIO 2
		// 2) Crea un arreglo de Strings llenarlo y mostrar cada elemento de ese arreglo
		String[] nombres = new String[3];
		
		// Mandar llamar los metodos
		llenarArreglo(nombres);
		mostrarArregloString(nombres);
	}// fin de main
	
		// metodo para llenarlo
	public static void llenarArreglo(String arreglo[]) {
		for (int i = 0; i < arreglo.length; i++) {
			String palabras = JOptionPane.showInputDialog("Ingresa una nombre");
			arreglo[i] = (palabras);
		} // for
	}// fin metodo llenar arrelo

	// metodo mostrar arreglo
	public static void mostrarArregloString(String arreglo[]) {
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println("En el indice [" + i + "]" + "está la palabra de [" + arreglo[i] + "]");
		}// FOR
	}// FIN METODO MOSTRARARREGLOSTRING

}// fin de la clase