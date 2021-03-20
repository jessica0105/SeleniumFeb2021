package POO2;

public class Directivo extends Empleado{
	
	public Directivo (String nombre) {
		super(nombre);
		System.out.println("constructor de directivo");
	}

	/**
	 * 
	 */
	public Directivo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	
	public String toString() {
		return super.toString() + " -> Directivo";
	}

}// class
