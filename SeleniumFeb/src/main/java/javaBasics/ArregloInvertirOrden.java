package javaBasics;

public class ArregloInvertirOrden {
	// dado un arreglo de 5 indices con los valores 1,2,3,4,5 guardar los valores en otro arreglo y mostrar invertido el orden
	public static void main(String[] args) {
	// crear arreglo con 5 indices
		int[] arreglo1= {1, 2, 3, 4, 5}; //0 1 2 3 4
		
		// el arreglo 2 toma el tamaño de arreglo 1
		int[] arreglo2 = new int [arreglo1.length]; // {5,4,3,2,1}
		
		//ciclo donde guardmos los valore en el arreglo dos de forma invertoda
		for(int i = (arreglo1.length-1), j = 0; i>=0; i--, j++) {
			
			arreglo2[j] = arreglo1[i];
			System.out.println(arreglo2[j]);
			// arreglo2 indice 0 = 5
			// arreglo2 indice 1 = 4
		}

	}

}
