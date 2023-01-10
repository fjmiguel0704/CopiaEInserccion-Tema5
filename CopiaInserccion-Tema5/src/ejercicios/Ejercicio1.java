package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Creamos el Scanner
		Scanner read = new Scanner (System.in);
		
		//Creamos el Array 
		int tabla [] = new int [15];
		
		//Creamos el segundo Array
		int tabla2 [] = new int [15];
		
		//Guardaremos los números del usuario
		int numero;
		
		//Pedimos 15 números al usuario
		System.out.println("Introduce 15 números: ");
		
		//Guardamos los números introducidos en el primer array
		for (int i = 0; i<tabla.length; i++) {
			numero=read.nextInt();
			tabla[i]=numero;
		}
		
		//Mostramos la tabla
		System.out.println(Arrays.toString(tabla));
		
		//Creamos esta variable para guardar el valor de la posición 15 del primer array
		int ultimaPosicion = tabla.length;
		
		//Pasamos el valor de la ultima posicion a la posicion 0 del segundo array
		tabla2[0]=ultimaPosicion;
		
		//hacemos la rotación de números hacia la derecha
		System.arraycopy(tabla, 0, tabla2, 1, tabla2.length-1);
		System.out.println(Arrays.toString(tabla2));

	}

}
