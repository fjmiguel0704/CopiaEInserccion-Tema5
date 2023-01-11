package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	/**
	 * Escribe un programa que lea 15 números por teclado y que los almacene en un
	 * array. Rota los elementos de ese array, es decir, el elemento de la posición
	 * 0 debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se
	 * encuentra en la última posición debe pasar a la posición 0. Finalmente,
	 * muestra el contenido del array.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Creamos el Scanner
		Scanner read = new Scanner(System.in);

		// Creamos el Array
		int tabla[] = new int[15];

		// Creamos el segundo Array
		int tabla2[] = new int[15];

		// Guardaremos los números del usuario
		int numero;

		// Pedimos 15 números al usuario
		System.out.println("Introduce 15 números: ");

		// Guardamos los números introducidos en el primer array
		for (int i = 0; i < tabla.length; i++) {
			numero = read.nextInt();
			tabla[i] = numero;
		}

		// Mostramos la tabla
		System.out.println(Arrays.toString(tabla));

		// Creamos esta variable para guardar el valor de la posición 15 del primer
		// array
		int ultimaPosicion = tabla.length;

		// Pasamos el valor de la ultima posicion a la posicion 0 del segundo array
		tabla2[0] = ultimaPosicion;

		// hacemos la rotación de números hacia la derecha
		System.arraycopy(tabla, 0, tabla2, 1, tabla2.length - 1);
		System.out.println(Arrays.toString(tabla2));

	}

}
