package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int tablaEnteros[] = new int[10];

		int pares = 0, impares = 0;

		System.out.println("Introduce 10 números enteros:");
		for (int i = 0; i < tablaEnteros.length; i++) {
			tablaEnteros[i] = read.nextInt();

			if (tablaEnteros[i] % 2 == 0) {
				pares++;
			}

			else {
				impares++;
			}
		}

		int numPares[] = new int[pares];
		int numImpares[] = new int[impares];

		pares=0;
		impares=0;
		
		for (int i = 0; i < tablaEnteros.length; i++) {
			if (tablaEnteros[i] % 2 == 0) {
				numPares[pares] = tablaEnteros[i];
				pares++;
			}

			else {
				numImpares[impares] = tablaEnteros[i];
				impares++;
			}

		}

		System.out.println(Arrays.toString(tablaEnteros));
		System.out.println(Arrays.toString(numPares));
		System.out.println(Arrays.toString(numImpares));

	}

}
