package POO;

public class EmpleadoOperarioOficial extends EmpleadoOperario {
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

	public EmpleadoOperarioOficial() {

	}

	/**
	 * @author JGARCIA
	 * @date 07/03/2021
	 * @param String
	 */

	public EmpleadoOperarioOficial(String nombre) {
		super(nombre);

	}

	/**
	 * @author JGARCIA
	 * @date 07/03/2021
	 * @param N/A
	 */

	public String toString() {
		return super.toString() + " -> Oficial";
	}

}// end class
