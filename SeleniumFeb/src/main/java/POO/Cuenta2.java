package POO;

public class Cuenta2 {
	private String nombre;
	private String numeroCuenta;
	private double tipoInteres;
	private double saldo;
	
	// constructor source constructor using fields
	/**
	 * @param nombre
	 * @param numeroCuenta
	 * @param tipoInteres
	 * @param saldo
	 */
	public Cuenta2(String nombre, String numeroCuenta, double tipoInteres, double saldo) {
		this.nombre = nombre;
		this.numeroCuenta = numeroCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;
	}
	/**
	 * @param nombre
	 * @param numeroCuenta
	 * @param tipoInteres
	 * @param saldo
	 */
	public Cuenta2(Cuenta2 c) {
		this.nombre = c.nombre;
		this.numeroCuenta = c.numeroCuenta;
		this.tipoInteres = c.tipoInteres;
		this.saldo = c.saldo;
	}
	
	//metodos automaticos desde source generate setters and getters
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
	/**
	 * @return the numeroCuenta
	 */
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	/**
	 * @param numeroCuenta the numeroCuenta to set
	 */
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	/**
	 * @return the tipoInteres
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}
	/**
	 * @param tipoInteres the tipoInteres to set
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

	
	
}// end class
