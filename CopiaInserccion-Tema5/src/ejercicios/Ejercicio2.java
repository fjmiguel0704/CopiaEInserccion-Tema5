package ejercicios;

import java.util.Arrays;

public class Ejercicio2 {

	/**
	 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y
	 * que los almacene en un array. El programa debe ser capaz de pasar todos los
	 * números pares a las primeras posiciones del array (del 0 en adelante) y todos
	 * los números impares a las celdas restantes. Utiliza arrays auxiliares si es
	 * necesario.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
//		int numeros = 0;
//		int par = 0;
//		int impar = 0;
//
//		int tabla[] = new int[20];
//		int tabla2[] = new int[20];
//		int tabla3[] = new int[20];
//
//		for (int i = 0; i < tabla.length; i++) {
//			tabla[i] = (int) (Math.random() * 100);
//			
//			if (tabla[i]%2==0) {
//				tabla2[par]=tabla[i];
//				par++;
//			}
//			
//			else {
//				tabla3[impar]=tabla[i];
//				impar++;
//			}
//		}
//		
//		//System.arraycopy(tabla3, 0, tabla2, 10, tabla2.length-1);
//
//		System.out.println(Arrays.toString(tabla));
//		System.out.println(Arrays.toString(tabla2));
//		System.out.println(Arrays.toString(tabla3));

		int tabla[] = new int[20];
		int tabla2[] = new int[20];

		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * 100);
		}

		System.out.println(Arrays.toString(tabla));

		int incremento = 0;
		for (int valoresPares : tabla) {
			if (valoresPares % 2 == 0) {
				tabla2[incremento] = valoresPares;
				incremento++;
			}
		}

		for (int valoresImpares : tabla) {
			if (valoresImpares % 2 == 1) {
				tabla2[incremento] = valoresImpares;
				incremento++;
			}
		}

		System.out.println(Arrays.toString(tabla2));
	}

}