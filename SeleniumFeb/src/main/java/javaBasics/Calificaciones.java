package javaBasics;
import javax.swing.JOptionPane;

public class Calificaciones {

	public static void main(String[] args) {
		// 1) Dada una calificacion por telcado mostrar el mensaje segun corresponde
		// si la calificacions es menor o igual de 60 Mensaje(reprobado)
		// si la calificacions es Mayor o igual de 70 pero menor de 90 Mensaje(Aprobado
		// Buena)
		// si la calificacions es Mayor o igual de 90 Mensaje(Aprobado Sobresaliente)

		int calif = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la calificación"));
		if (calif >= 90 && calif <=100) {// inicia if
			System.out.println("La calificación " + calif + " es sobresaliente");

		} else if (calif >= 70 && calif < 90) {
			System.out.println("La calificación " + calif + " es aprobatoria");
		}

		else {
			System.out.println("La calificación " + calif + " no es aprobatoria");
		}

	}// fin de main

}// fin de la clase
