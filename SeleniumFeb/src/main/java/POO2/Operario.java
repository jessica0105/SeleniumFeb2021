package POO2;

public class Operario extends Empleado{
	
	// hereda la variable nombre de la clase empleado
	public Operario (String nombre) {
		super(nombre);
		System.out.println("Constructor operario");
	}
	
	public Operario () {
		super ();
	}
	
	@Override
	public String toString() {
		return super.toString() + " -> Operario";
	}
	

}//class
