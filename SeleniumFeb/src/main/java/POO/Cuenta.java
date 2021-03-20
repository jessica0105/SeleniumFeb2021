package POO;

public class Cuenta {
	// declarar variables privadas, que solo esta clase puede verlas
	private String nombre;
	private String numeroCuenta;
	private double tipoInteres;
	private double saldo;

	// visible dentro de las clases del mismo paquete
	// protected

	/**
	 * @author JGARCIA
	 * @date 06/03/2021
	 * @param N/A
	 */

	// CONSTRUCTOR
	public Cuenta() {

	}// fin constructor 1

	/**
	 * @author JGARCIA
	 * @date 06/03/2021
	 * @param N/A
	 */

	public Cuenta(String nombre, String numeroCuenta, double tipoInteres, double saldo) {
		// la variable nombre de la clase vale lo mismo que guardes en el atributo
		// agregado en el costructor
		this.nombre = nombre;
		this.numeroCuenta = numeroCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;
	}// fin constructor 2

	// constructor 3 recibe objeto de la clase
	/**
	 * @author JGARCIA
	 * @date 06/03/2021
	 * @param N/A
	 */

	public Cuenta(Cuenta c) {// recibimos un objeto como parametro
		// objeto de la clase cuenta y accedemos a los atributos de la clase cuenta
		nombre = c.nombre;
		numeroCuenta = c.numeroCuenta;
		tipoInteres = c.tipoInteres;
		saldo = c.saldo;

	}// fin constructor 3

	/**
	 * @author JGARCIA
	 * @date 06/03/2021
	 * @param String
	 */

	// metodo set que inicializa nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}// fin metodo setNombre

	// metodo set que inicializa numero cuenta
	/**
	 * @author JGARCIA
	 * @date 06/03/2021
	 * @param String
	 */
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}// fin metodo setNumeroCuenta

	// metodo set que inicializa tipo interes
	/**
	 * @author JGARCIA
	 * @date 06/03/2021
	 * @param double
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}// fin metodo setTipoInteres

	// metodo set que inicializa saldo
	/**
	 * @author JGARCIA
	 * @date 06/03/2021
	 * @param double
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}// fin metodo setSaldo

	// metodo get que regresa nombre
	/**
	 * @author JGARCIA
	 * @date 06/03/2021
	 * @param string
	 */
	public String getNombre() {
		return this.nombre;
	}// fin get nombre

	// metodo get que regresa numeroCuenta
	/**
	 * @author JGARCIA
	 * @date 06/03/2021
	 * @param string
	 */
	public String getNumeroCuenta() {
		return this.numeroCuenta;
	}// fin get numerocuenta

	// metodo get que regresa tipoInteres
	/**
	 * @author JGARCIA
	 * @date 06/03/2021
	 * @param double
	 */
	public double getTipoInteres() {
		return this.tipoInteres;
	}// fin get tipoInteres

	// metodo get que regresa saldo
	/**
	 * @author JGARCIA
	 * @date 06/03/2021
	 * @param double
	 */
	public double getSaldo() {
		return this.saldo;
	}// fin get saldo

	// metodo get que regresa saldo
	/**
	 * @author JGARCIA
	 * @date 06/03/2021
	 * @param boolean
	 */
	public boolean ingreso(double n) {
		boolean ingresoCorrecto = true;

		if (n < 0) {
			ingresoCorrecto = false;
		} else {
			saldo = saldo + n;
		}
		return ingresoCorrecto;
	}// fin ingreso

	/**
	 * @author JGARCIA
	 * @date 06/03/2021
	 * @param double
	 */
	public boolean reintegro(double n) {
		boolean reintegroCorrecto = true;

		if (n < 0) {
			reintegroCorrecto = false;
		} else if (saldo >= n) {
			saldo -= n;
		} else {
			reintegroCorrecto = false;
		}
		return reintegroCorrecto;
	}// fin reintegro

	/**
	 * @author JGARCIA
	 * @date 06/03/2021
	 * @param object double
	 */
	public boolean transferencia(Cuenta c, double n) {
		boolean correcto = true;

		if (n < 0) {
			correcto = false;
		} else if (saldo >= n) {
			reintegro(n);
			c.ingreso(n);
		} else {
			correcto = false;
		}

		return correcto;
	}// fin transferencia

}// fin de la clase
