package POO;
import java.util.Scanner;

public class TestCuenta {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		 String nombre;
		 String numero;
		 double tipo;
		 double importe;
		 double prueba;
		 
		 //crear un objeto de la clase cuenta usando el constructor sin parametros
		 //objeto cuenta1 es del tipo Cuenta y no tiene parametros
		 Cuenta cuenta1 = new Cuenta();
		 //asignar valor a las variables por teclado
		 System.out.println("Ingresa el nombre del titula de la cuenta 1: ");
		 nombre = teclado.next(); //variables locales del metodo main
		 System.out.println("Ingresa el número de cuenta1: ");
		 numero = teclado.next(); //variables locales del metodo main
		 System.out.println("Tipo de interes cuenta1: ");
		 tipo = teclado.nextDouble();
		 System.out.println("Saldo de la cuenta1: ");
		 importe = teclado.nextDouble();
		 teclado.close();
		 
		 //asignar valores con el metodo set
		 cuenta1.setNombre(nombre);
		 cuenta1.setNumeroCuenta(numero);
		 cuenta1.setTipoInteres(tipo);
		 cuenta1.setSaldo(importe);
		 System.out.println(cuenta1.getNombre());
		 //utilizar constructor con parametros y asignarlos
		 
		 Cuenta cuenta2 = new Cuenta ("Jessica Garcia", "123456789", 12.3, 5000);
		 System.out.println("El titular de la cuenta2 es: " + cuenta2.getNombre());
		 
		 // utilizar constructor que recibe un objeto
		 Cuenta cuenta3 = new Cuenta (cuenta1);
		 System.out.println("Saldo de la cuenta 1: "+ cuenta1.getSaldo());
		 System.out.println("Saldo de la cuenta 3: "+ cuenta3.getSaldo());
		 System.out.println("Tipo de interes: " + cuenta1.getTipoInteres());
		 cuenta3.setNombre("Lidia");
		 
		 // ingreso en la cuenta 1
		 cuenta1.ingreso(4000);		 
		 System.out.println(" ");
		 System.out.println("///////// Después del ingreso ///////////");
		 System.out.println("Saldo de la cuenta 1: "+ cuenta1.getSaldo());
		 System.out.println("Saldo de la cuenta 3: "+ cuenta3.getSaldo());
		 
		 // mostrar datos de la cuenta 2
		 System.out.println(" ");
		 System.out.println("///////////////////Datos de la cuenta 2////////////////////");
		 System.out.println("Nombre del titular: " + cuenta2.getNombre());
		 System.out.println("Número de la cuenta: " + cuenta2.getNumeroCuenta());
		 System.out.println("Tipo de Interes: " + cuenta2.getTipoInteres());
		 System.out.println("Saldo: " + cuenta2.getSaldo());
		 
		 // mostrar datos de la cuenta 3
		 System.out.println(" ");
		 System.out.println("///////////////////Datos de la cuenta 3////////////////////");
		 System.out.println("Nombre del titular: " + cuenta3.getNombre());
		 System.out.println("Número de la cuenta: " + cuenta3.getNumeroCuenta());
		 System.out.println("Tipo de Interes: " + cuenta3.getTipoInteres());
		 System.out.println("Saldo: " + cuenta3.getSaldo());
		 
		 //realizar una transferencia de 1000 de la cuenta3 a la cuenta 2
		 cuenta3.transferencia(cuenta2, 1000);
		 System.out.println(" ");
		 System.out.println("///////// Después de la transferencia ///////////");
		 System.out.println("/////////////////////////////////////////////////");
		 System.out.println(" ");
		 // mostrar datos de la cuenta 2
		 System.out.println("///////////////////Datos de la cuenta 2////////////////////");
		 System.out.println("Nombre del titular: " + cuenta2.getNombre());
		 System.out.println("Número de la cuenta: " + cuenta2.getNumeroCuenta());
		 System.out.println("Tipo de Interes: " + cuenta2.getTipoInteres());
		 System.out.println("Saldo: " + cuenta2.getSaldo());
		 
		 // mostrar datos de la cuenta 3
		 System.out.println("///////////////////Datos de la cuenta 3////////////////////");
		 System.out.println("Nombre del titular: " + cuenta3.getNombre());
		 System.out.println("Número de la cuenta: " + cuenta3.getNumeroCuenta());
		 System.out.println("Tipo de Interes: " + cuenta3.getTipoInteres());
		 System.out.println("Saldo: " + cuenta3.getSaldo());
		 
		 Cuenta cuenta4 = new Cuenta (cuenta3);
		 cuenta4.setNombre("Sami");
		 cuenta4.setSaldo(3000);
		 
		 System.out.println(cuenta4.getNombre());
		 prueba = cuenta4.getSaldo();
		 System.out.println(prueba);
		 
		 
		cuenta2.reintegro(200);
		System.out.println("Reintegro: "+cuenta2.getSaldo());
		 
		// GENERAR UN METODO QUE SE GENERE UN NOMBRE AL AZAR DE UNA LISTA DE NOMBRES

	}

}
