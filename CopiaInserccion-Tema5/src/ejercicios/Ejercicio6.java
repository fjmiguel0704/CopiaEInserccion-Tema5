package ejercicios;

import java.util.Arrays;

public class Ejercicio6 {

	public static void main(String[] args) {
		int array []= new int [100];
		int arrayInverso []= new int [100];
		
		for (int i = 0; i<array.length; i++) {
			array[i]=i+1;
		}
		
		int posicion=array.length-1;
		for (int valores: array) {
			arrayInverso[posicion]=valores;
			posicion--;
		}
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(arrayInverso));
	}

}
