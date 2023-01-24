package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String opcion;
		int valor, posicion;
		int enteros[] = new int[10];

		do {
			System.out.println("Elige una de las siguientes opciones:");
			System.out.println("a. Mostrar valores");
			System.out.println("b. Introducir valores");
			System.out.println("c. Salir");
			opcion = read.next();

			switch (opcion) {
			case "a":
				System.out.println(Arrays.toString(enteros));
				System.out.println();
				break;
			case "b":
				System.out.println("Introduce un valor: ");
				valor = read.nextInt();
				System.out.println("Introduce una posición para ese valor: ");
				posicion = read.nextInt();
				enteros[posicion] = valor;
				break;
			case "c":
				break;
			default:
				System.out.println("La opción introducida no es correcta");
			}
		} while (!opcion.equals("c"));
	}

}
