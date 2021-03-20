package javaBasics;
import javax.swing.JOptionPane;

public class Arreglo {
 
	public static void main(String[] args) {
		int numeros[] = new int[5];
		
		// mandar llamrlos metodos
		rellenarListaDeNumeros(numeros);
		mostrarArreglo(numeros);
				
		//valores capturados 5, 6, 7, 8, 9, 10
		
	}// fin de main
	
	
	 // metodo que llena el arreglo
	public static void rellenarListaDeNumeros(int arreglo[]) {
		
		for(int i=0; i<arreglo.length;i++) {
			String texto = JOptionPane.showInputDialog("Ingresa un número");
			arreglo[i] = Integer.parseInt(texto);
		}
	}// fin metodo rellenarListaDeNumeros
	
	public static void mostrarArreglo(int arreglo[]) {
		for(int i=0; i<arreglo.length;i++) {
			System.out.println("En el indice ["+i+"]" + "esta el valor de ["+arreglo[i]+"]");
		}
	}

}// fin de la clase



    
    
    
  
