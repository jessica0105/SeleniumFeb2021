package POO2;

public class Oficial extends Operario {

	public Oficial(String nombre) {
		super(nombre);
		System.out.println("constructor oficial");
	}

	public Oficial() {
		super();
	}

	@Override
	public String toString() {
		return super.toString() + " -> Oficial";
	}

}// class
