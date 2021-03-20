package POO;

import java.util.Scanner;

public class EmpleadoDirectivo extends Empleado {
	/*
	 * Empleado -> Dircetivo
	 * 
	 */
	/**
	 * @author JGARCIA
	 * @date 07/03/2021
	 * @param N/A
	 */

	public EmpleadoDirectivo() {

	}

	/**
	 * @author JGARCIA
	 * @date 07/03/2021
	 * @param String
	 */

	public EmpleadoDirectivo(String nombre) {
		super(nombre);

	}

	/**
	 * @author JGARCIA
	 * @date 07/03/2021
	 * @param N/A
	 */

	public String toString() {
		return super.toString() + " -> Directivo";
	}

}// end class
