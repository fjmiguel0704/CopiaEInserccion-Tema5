package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int tamañoArray;
		int valorInicial;
		int incremento;

		System.out.println("Introduce el tamaño de la tabla:");
		tamañoArray = read.nextInt();
		System.out.println("Introduce el valor inicial de la tabla: ");
		valorInicial = read.nextInt();
		System.out.println("Introduce en cuanto quieres que se incremente la tabla: ");
		incremento = read.nextInt();

		int tabla[] = new int[tamañoArray];

		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = valorInicial;
			valorInicial += incremento;
		}

		System.out.println(Arrays.toString(tabla));

	}

}
