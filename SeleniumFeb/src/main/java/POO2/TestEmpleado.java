package POO2;

public class TestEmpleado {

	public static void main(String[] args) {
		// el objeto empleado utiliza el constructor con parametro nombre
		Empleado E1 =  new Empleado ("Jessica");
		Directivo D1 = new Directivo ("Samanta");
		Operario OP1 = new Operario ("Edson");
		Oficial OF1 = new Oficial ("Emilio");
		Tecnico T1 = new Tecnico ("Daniela");
		
		// polimorfismo la clase padre puede acceder a elementos de las clases hijas sin tenerlas declaradas
		Empleado E2 = new Tecnico ("Jessica");
		
		System.out.println(" ");
		System.out.println(E1.toString());
		System.out.println(" ");
		System.out.println(D1);
		System.out.println(" ");
		System.out.println(OP1);
		System.out.println(" ");
		System.out.println(OF1);
		System.out.println(" ");
		System.out.println(T1);
		System.out.println(" ");
		System.out.println(E2);
		System.out.println(" ");
	
	}

}
