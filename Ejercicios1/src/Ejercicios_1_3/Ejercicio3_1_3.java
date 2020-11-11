package Ejercicios_1_3;

import java.util.Scanner;

public class Ejercicio3_1_3 {

	public static void main(String[] args) {
		// Ejercicio 3 de 1.3
		Scanner leer = new Scanner(System.in);

		int numero=0, tam=0;
		
		System.out.println("Dime un numero");
		numero = leer.nextInt();
		
		System.out.println("Dime cuantos multiplos suyos quieres que te de");
		tam = leer.nextInt();
		
		int vMultiplos[] = new int[tam]; 
		
		for (int i = 0; i < vMultiplos.length; i++) {
			System.out.println(numero+"x"+(i+1)+"="+(numero*(i+1)));
		}
		
		
	}

}
