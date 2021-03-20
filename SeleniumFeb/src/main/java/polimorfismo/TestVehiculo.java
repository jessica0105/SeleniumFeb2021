package polimorfismo;

public class TestVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//objeto de la clase vehiculo tipo arreglo de tamaño 4
		Vehiculo misVehiculos[] = new Vehiculo[4];
		misVehiculos[0] = new Vehiculo ("SKL-8922", "Ford", "2019");
		misVehiculos[1] = new VehiculoTurismo (8, "OLP-8998", "Nissan", "2000");
		misVehiculos[2] = new VehiculoDeportivo ("UIK-0908", "Chevrolet", "2017", 4);
		misVehiculos[3] = new VehiculoFurgoneta ("TRF-6777", "Toyota", "2018", 100);
		
	
		
		//variable tipo vehiculo el arreglo lo va recorriendo y en cada indice
		//vehiculos = misVehiculos[0]
		for(Vehiculo vehiculos: misVehiculos) {
			System.out.println(vehiculos.mostrarDatos());
			System.out.println(" ");
		}
		//objeto normal
		Vehiculo vehiculodeportivo = new VehiculoDeportivo ("UIK-0000", "Chevrolet", "2017", 4);
		System.out.println(vehiculodeportivo.mostrarDatos());

	}

}// class
