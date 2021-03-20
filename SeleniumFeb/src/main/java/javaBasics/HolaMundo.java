package javaBasics; // minusculas

public class HolaMundo {//open  class
	
	//tipos de variables
	
	String miNombre ="Jessica Garcia"; // al hacer ctrl clic sobr string puedes ver la clase string
	int edad = 32;
	// POR CADA CHAR SE DEFINE 1 LETRA
	char letra = 'n';
	
	// CON DECIMALES
	float edadConDecimal =(float) 32.0;
	double edadDouble = 32.00000;
	
	// VALORES DE VERDADERO O FALSO 
	boolean bandera = true;
	
	// variables locales
	
	
	// variables instancia
	public static void main(String[] args) {
		//String miNombre =""; // solo se usa en este metodo, si se ocupa usar en varios metodos se declara fuera del metodo (en la clase)
		System.out.println("Hola mundo"); // mostrar mensaje en consola
		
		double numero1 = 500.00035;
		double numero2 = 35.37;
		// int miEdad = 30;
		double resultado=numero1+numero2;
		
		// ctrl + shift +f ordena el código
		
		// mostrar la suma de los numeros 
		System.out.println("El resultado de la suma es: "+ resultado);
		
		// mostrar el resultado sin declarar variabl de resultado
		System.out.println("El resultado de la suma es: "+ (numero1+numero2)); // al poner los parentesis se realiza la operación matematica y despus muestra el mensaje 
		System.out.println("El resultado de la multiplicación es: "+ (numero1*numero2)); 
		System.out.println("El resultado de la división es: "+ (numero1/numero2)); 
		System.out.println("El resultado de la resta es: "+ (numero1-numero2)); 
	}

}// end class
