package POO;

import java.util.Scanner;

public class EmpleadoOperario extends Empleado {
	/*
	 * Empleado Alfonso -> Operario
	 */
	/**
	 * @author JGARCIA
	 * @date 07/03/2021
	 * @param String
	 */

	public EmpleadoOperario(String nombre) {
		super(nombre);

	}

	/**
	 * @author JGARCIA
	 * @date 07/03/2021
	 * @param N/A
	 */

	public EmpleadoOperario() {

	}

	/**
	 * @author JGARCIA
	 * @date 07/03/2021
	 * @param N/A
	 */

	public String toSring() {
		return super.toString() + " -> Operario";
	}
}// end class
