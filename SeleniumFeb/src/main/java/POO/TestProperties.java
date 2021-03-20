package POO;

import comun.LeerProperties;

public class TestProperties {

	public static void main(String[] args) {
		LeerProperties prop = new LeerProperties();

		prop.getSystemProperties();

		// el nombre de las variables de data.properties va en comillas
		String mensaje = System.getProperty("MENSAJE");
		String mensaje2 = System.getProperty("HOLA");
		String mensaje3 = System.getProperty("JESSICA");
		int numero = Integer.parseInt(System.getProperty("NUMERO"));

		System.out.println(mensaje);
		System.out.println(mensaje2);
		System.out.println(mensaje3);
		System.out.println(numero);

		prop.setSystemPropFileName(
				System.getProperty("user.dir") + "\\src\\main\\resources\\dataFiles\\data2.properties");
		prop.getSystemProperties(); // CARGA EL SEGUNDO ARCHVIO

		String mensaje4 = System.getProperty("nuevo");
		System.out.println(mensaje4);

	}

}
