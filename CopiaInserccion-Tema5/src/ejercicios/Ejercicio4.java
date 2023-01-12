package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.Position;

public class Ejercicio4 {

	/**
	 * Escribir un programa que lea 10 valores enteros por teclado y los almacene en
	 * una tabla (tablaEnteros). A continuación, debes construir una tabla que
	 * contenga los mismos elementos que tablaEnteros pero sin repetir. Usa el
	 * algoritmo de búsqueda explicado en los apuntes.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
   		int numeros=0; 
		
		Scanner read = new Scanner(System.in);
		int tabla[] = new int[10];
		int tabla2[] = new int[10];

		System.out.println("Introduce 10 números enteros: ");
		for (int i = 0; i < tabla.length; i++) {
			numeros = read.nextInt();
			tabla[i] = numeros;
		}
		
		System.out.println(Arrays.toString(tabla ));
		
		int indice=0;
		for (int valores: tabla) {
				 if (valores==numeros) {
					 break;
				 }
				 
				 else {
					 tabla2[indice]=valores;
					 indice++;
				 }
			}
		
		System.out.println(Arrays.toString(tabla2));
		}
	}

