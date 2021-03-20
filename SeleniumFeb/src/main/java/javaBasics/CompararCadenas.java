package javaBasics;

import java.util.Scanner;

public class CompararCadenas {

	public static void main(String[] args) {
		// creamos Scaner para leer palabras

		Scanner leer = new Scanner(System.in);
	
		System.out.println("Escribe la primer palabra:");
		String palabra1 = leer.next();
		leer.close();
		System.out.println("Escribe la segunda palabra:");
		String palabra2 = leer.next();
		leer.close(); // termina el metodo scanner
		
		if(palabra1.equals(palabra2)) {
			System.out.println("Las palabras son iguales");
		}else {
			System.out.println("Las palabras no son iguales");
		}
		
		if(palabra1.equalsIgnoreCase(palabra2)) {
			System.out.println("Las palabras son iguales");
		}else {
			System.out.println("Las palabras no son iguales");
		}
		
		String texto="Un texto 85 es una compiosición de 250 signos codificados en un sistema de escritura";
		String textoSinespacios = texto.replace(" ", "");
		//String textoSinNumeros = texto.replace(" ", "");
		System.out.println(textoSinespacios);
		//System.out.println(textoSinNumeros);
		
		//tamaño de los arreglos contando caracteres y espacios en blanco
		System.out.println("El texto tiene ["+texto.length()+"]");
				
	}// fin de mane

}// fin de la clase
