package POO;

public class EmpleadoOperarioTecnico extends EmpleadoOperario {
	/*
	 * Empleado Luis -> Operario -> Oficial 
	 * Empleado Pablo -> Operario -> Tecnico
	 * 
	 */
	/**
	 * @author JGARCIA
	 * @date 07/03/2021
	 * @param N/A
	 */

	public EmpleadoOperarioTecnico() {

	}

	/**
	 * @author JGARCIA
	 * @date 07/03/2021
	 * @param String
	 */

	public EmpleadoOperarioTecnico(String nombre) {
		super(nombre);

	}

	/**
	 * @author JGARCIA
	 * @date 07/03/2021
	 * @param N/A
	 */

	public String toString() {
		return super.toString() + " -> Técnico";
	}

}// end class
