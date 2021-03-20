package POO;

public class Empleado {
	private String nombre;
	
	/**
	 * @author JGARCIA
	 * @date 07/03/2021
	 * @param N/A
	 */
	
	//constructor default
	public Empleado() {
	}// end constructor default
	
	//constructor con parametros que inicializa el nombre String
	
	/**
	 * @author JGARCIA
	 * @date 07/03/2021
	 * @param String
	 */
	
	public Empleado (String nombre) {
		this.nombre=nombre;
	}// end constructor con parametro nombre
	
	//metodo setNombre
	/**
	 * @author JGARCIA
	 * @date 07/03/2021
	 * @param String
	 */
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}// end setNombre
	
	//metodo getNombre
	/**
	 * @author JGARCIA
	 * @date 07/03/2021
	 * @param String
	 */
	
	public String getNombre() {
		return this.nombre;
	}// end getNombre
	
	//Un método toString() que devuelve el String: "Empleado " + nombre. 
	
	/**
	 * @author JGARCIA
	 * @date 07/03/2021
	 * @param String
	 */
	public String toString() {
	 return "Empleado " +nombre;
	}// end toString
}// end class
