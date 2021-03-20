package javaBasics;
import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		// al ingresar un numero que se muestre la tabla de multiplicar
		Scanner teclado = new Scanner (System.in);
		int tabla= 0;
		int resultado = 0;
		int numeroTemp = 0; 
		
		System.out.println("Ingresa el número que quieres multiplicar");
		numeroTemp = teclado.nextInt();
	
		while(numeroTemp<=0)	{
			System.out.println("El número que ingresaste debe ser mayor que 0, ingresa nuevamente");
			numeroTemp = teclado.nextInt();	
		}//while
			
		for(int i=1; i<=10; i++) {
			resultado = i * numeroTemp;
			System.out.println("La múltiplicación " +numeroTemp+ " por " +i+ " es: " +resultado);
		}//for 

	}//main

}// clase
