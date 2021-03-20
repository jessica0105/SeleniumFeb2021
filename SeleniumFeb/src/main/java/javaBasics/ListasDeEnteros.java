package javaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListasDeEnteros {

	public static void main(String[] args) {
		// declarar lista de enteros
		List<Integer> listaDeNumeros = new ArrayList<>();
		listaDeNumeros.add(100);
		listaDeNumeros.add(250);
		listaDeNumeros.add(50);
		listaDeNumeros.add(3);
		listaDeNumeros.add(45);
		listaDeNumeros.add(50);
		listaDeNumeros.add(56);
		listaDeNumeros.add(55);
		listaDeNumeros.add(50);

		// imprimir los elementos de lista
		System.out.println("Lista sin ordenar: " + listaDeNumeros);
		Collections.sort(listaDeNumeros); // ordena de menor a mayor
		System.out.println("Lista ordenada de menor a mayor: " + listaDeNumeros); // imprime la lista de menor a mayo

		// ordenamos e invertimos el orden de la lista sort es para ordenar de mayor a
		// menor
		Collections.sort(listaDeNumeros, Collections.reverseOrder());
		// mostrar lista invertida
		System.out.println("Lista ordenada de mayor a menor: " + listaDeNumeros);

		// borrar elementos repetidos
		Object last = null;
		int numCount = 0;
		Iterator<Integer> i = listaDeNumeros.iterator();

		while (i.hasNext()) {

			Object temp = i.next(); // guarda el primer elemeto de la lista
			if (temp.equals(last)) {
				i.remove();
				numCount++; // cuenta la cantidad de elementos que estan repetidos

			} else {
				last = temp;

			} // fin else
		} // fin de while

		System.out.println("Lista sin números repetidos: " + listaDeNumeros);
		System.out.println("El número estaba repetido: " + numCount + " veces"); // muestra cuanto elementos repetidos
																					// se borraron

		// OBTENER EL NUMERO MAyOR Y MENOR DE LA LISTA -- EJERCICIO 1
		System.out.println("Lista sin números repetidos: " + listaDeNumeros);
		System.out.println("El número mayor es: " + Collections.max((listaDeNumeros)));
		System.out.println("El número mayor es: " + Collections.min((listaDeNumeros)));
		Collections.reverse(listaDeNumeros);
			System.out.println(listaDeNumeros);
	}// fin de main

}// fin de clase
