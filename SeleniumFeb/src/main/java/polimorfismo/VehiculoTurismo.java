package polimorfismo;

public class VehiculoTurismo extends Vehiculo{
	
	private int numeroPuertas;

	/**
	 * @param matricula
	 * @param marca
	 * @param modelo
	 */
	

	public VehiculoTurismo(int numeroPuertas, String matricula, String marca, String modelo) {
		super(matricula, marca, modelo);
		this.numeroPuertas=numeroPuertas;
		// 
	}

	/**
	 * @return the numeroPuertas
	 */
	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	@Override
	public String mostrarDatos() {
		return "Matrícula: " + matricula + "\nMarca: "+ marca+ "\nModelo: "+modelo + "\nNúmero de puertas: "+numeroPuertas;
		
	}
	

}//class
