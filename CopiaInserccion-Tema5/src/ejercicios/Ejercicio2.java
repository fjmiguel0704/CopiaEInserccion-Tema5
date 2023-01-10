package ejercicios;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		int numeros = 0;
		
		int tabla [] = new int [20];
		int tabla2[] = new int [20];
		
		for (int i = 0; i<tabla.length; i++) {
			numeros = (int) (Math.random()*100);
			tabla[i]=numeros;
		}
		
		System.out.println(Arrays.toString(tabla));
		
		for (int i = 0; i<tabla2.length; i++) {
			
		}
		
		

		
	}

}
