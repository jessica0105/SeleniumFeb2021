package POO2;

public class Empleado {

	private String nombre;

	public Empleado() {

	}

	public Empleado(String nombre) {
		this.nombre = nombre;
		System.out.println("Constructor de la clase empleado " + nombre);
		System.out.println(" ");
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Empleado " + nombre;
	}
}// clase
