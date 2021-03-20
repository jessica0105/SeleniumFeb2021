package polimorfismo;

public class VehiculoFurgoneta extends Vehiculo{
	private int carga;
	
	public VehiculoFurgoneta(String matricula, String marca, String modelo, int carga) {
		super(matricula, marca, modelo);
		this.carga=carga;
		// 
	}

	/**
	 * @return the carga
	 */
	public int getCarga() {
		return carga;
	}
	
	@Override
	public String mostrarDatos() {
		return "Matrícula: " + matricula + "\nMarca: "+ marca+ "\nModelo: "+modelo + "\nCarga: "+carga;
		
	}


}
