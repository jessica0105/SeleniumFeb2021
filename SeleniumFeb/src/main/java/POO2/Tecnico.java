package POO2;

public class Tecnico extends Operario{

	/**
	 * 
	 */
	public Tecnico() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 */
	public Tecnico(String nombre) {
		super(nombre);
		System.out.println("constructor operario");
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return super.toString() + " -> Técnico";
	}

}// class
