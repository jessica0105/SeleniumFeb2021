package javaBasics;

public class MayorMenor { // open class
	// EJERCICIO 2 
	// declarar dos variables numericas indica cual es mayor de las dos o si son iguales.
	// ir cambiando valores para ver si el codigo esta bien

	public static void main(String[] args) {
		// 
		int numero1 = 10;
		int numero2 = 10;
		
		//condicionales
		if(numero1>=numero2) {// inicia if
			
			System.out.println("El n�mero " + numero1 +  " es mayor que el n�mero " + numero2);
			
		}if(numero1==numero2) {
			System.out.println("El n�mero " + numero1 +  " es igual que el n�mero " + numero2);
		}
		
		else {
			System.out.println("El n�mero " + numero1 +  " es menor que el n�mero " + numero2);
		}

	}// end main

}// end class
