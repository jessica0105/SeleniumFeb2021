package javaBasics;

public class MainMetodos {

	public static void main(String[] args) {
		Metodos objeto = new Metodos(10,20);
		
		System.out.println(objeto.sumatoria());
		objeto.mensajeBienvenida();
		String name= objeto.mostrarNombre("Jessica", "Garc�a");
		System.out.println(name);
	

	}

}
