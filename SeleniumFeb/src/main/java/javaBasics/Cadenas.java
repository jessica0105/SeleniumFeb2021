package javaBasics;

public class Cadenas {
	
	//Dada una cadena de caracteres, extraer la cuarta y quinta letra usando el metodo substring
	
	public static void main(String [] args) {
		
		String cadena = "Hola Curso Selenium";
		
		String cadenaguardada = cadena.substring (0,4);
		System.out.println(cadenaguardada);
		
		if(cadena.equals("Hola Curso Selenium")) {
			System.out.println("Las cadenas son iguales");
			
		}else {
			System.out.println("Las cadenas no son iguales");
		}
		
		if(cadena.equalsIgnoreCase("Hola Curso Selenium")) {
			System.out.println("Las cadenas son iguales");
			
		}else {
			System.out.println("Las cadenas no son iguales");
		}
		
		//contains si le importa que sean mayuscula o miniscula
		if(cadena.contains("curso")) {
			System.out.println("si esta el elemento");
			
		}else {
			System.out.println("no esta el elemento");
		}
	}

}
