package javaBasics;

import java.util.Scanner;

public class SumarParEImpar {

	public static void main(String[] args) {
		// utilizando la condicion si es divisible en 0
		// se lean 5 numeros y se vaya sumando 
		//declarar variable que lee lo que pases por teclado
		Scanner teclado = new Scanner(System.in);
		double par = 0;
		double impar = 0;
		double residuo;
		double numeroTemp;
		
		for (int i=1; i<=5; i++) {
			//solicita que ingreses el numero
			System.out.println("Ingrese el número: ["+i+"]");
			//ingresa por teclado un numero y lo toma como un tipo double
			numeroTemp = teclado.nextFloat();
			
			while(numeroTemp<0) {
				System.out.println("El número debe ser mayor a cero y tu número es: " + numeroTemp+ " Ingresa de nuevo");
				numeroTemp = teclado.nextFloat();
			}//while
			//saber si es par o impar
			residuo = numeroTemp%2;
			
			if (residuo==0) {
				par+=numeroTemp;
				System.out.println("El número es par: " +numeroTemp);
			}// if
			
			
			//residuop diferente a 0
			if(residuo!=0 && residuo>0) {
				impar+=numeroTemp;
				System.out.println("El número es impar: "+ numeroTemp);
			}// segundo if
					
		}// for
		teclado.close();
		System.out.println("La sumatoria de los pares es: ["+par+"]");
		System.out.println("La sumatoria de los impares es: ["+impar+"]");
	}//main

}//clase
