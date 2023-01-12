package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	static boolean esPrimos(int numero) {
		boolean estado = false;
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				break;
			}

			else {
				estado = true;
			}
		}
		return estado;
	}

	/**
	 * Realiza un programa que pida 10 números por teclado y que los almacene en un
	 * array. Seguidamente, el programa pasará los números primos a las primeras
	 * posiciones, desplazando el resto de números (los que no son primos) a las
	 * últimas posiciones, de tal forma que no se pierda ninguno. Al final se debe
	 * mostrar el array resultante.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int tabla[] = new int[10];
		int tabla2[] = new int[10];

		System.out.println("Introduce 10 números: ");
		
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = read.nextInt();
		}

		System.out.println(Arrays.toString(tabla));

		int incremento = 0;
		for (int primos : tabla) {
			if (esPrimos(primos) == true) {
				tabla2[incremento] = primos;
				incremento++;
			}
		}

		for (int noPrimos : tabla) {
			if (esPrimos(noPrimos) == false) {
				tabla2[incremento] = noPrimos;
				incremento++;
			}

		}
		
		System.out.println(Arrays.toString(tabla2));
	}

}
