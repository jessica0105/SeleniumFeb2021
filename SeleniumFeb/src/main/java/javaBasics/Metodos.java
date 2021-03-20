package javaBasics;

public class Metodos {
	// declarar variables
	int numero1, numero2, numero3;
	
	// constructor sin parametros
	
	
	// constructor con parametros se llama igual que la clase sirve para inicializar la clase
	public Metodos(int numero1, int numero2) {
		//inicializar
		this.numero1=numero1;
		this.numero2=numero2;
		
	}
	
	//  metodo que no regresa valor
	public void mensajeBienvenida () {
		System.out.println("Bienvenidos al curso de selenium");
		
	}
	
	// metodo que regresa el resultado de la suma
	public int sumatoria () {
		return numero1+numero2;

	}
	
	// metodo que regresa valor string
	public String mostrarNombre(String nombre, String apellido) {
		System.out.println(nombre);
		return nombre +" "+ apellido;
	}
	
	public static void main(String[] args) {
		
	}

}
