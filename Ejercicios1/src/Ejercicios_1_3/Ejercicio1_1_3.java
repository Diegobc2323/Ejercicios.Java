package Ejercicios_1_3;

import java.util.Scanner;

public class Ejercicio1_1_3 {

	public static void main(String[] args) {
		// Ejercicio 1 de 1.3
		Scanner leer = new Scanner(System.in);
		
		int vNumeros[] = new int[10];
		int suma=0;
		
		System.out.println("Dime 10 numeros y te dare su media");
		
		for (int i = 0; i < vNumeros.length; i++) {
			
			vNumeros[i] = leer.nextInt();
			suma += vNumeros[i];
		}
		
		System.out.println("La media de tus 10 numeros"
				+ " es "+(suma/vNumeros.length));
		
	}

}
