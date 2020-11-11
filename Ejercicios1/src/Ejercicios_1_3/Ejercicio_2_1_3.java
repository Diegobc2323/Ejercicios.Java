package Ejercicios_1_3;

import java.util.Scanner;

public class Ejercicio_2_1_3 {

	public static int media(){
		
Scanner leer = new Scanner(System.in);
		
		int vNumeros[] = new int[10];
		int suma=0, media=0;
		
		System.out.println("Dime 10 numeros y te dare su media");
		
		for (int i = 0; i < vNumeros.length; i++) {
			
			vNumeros[i] = leer.nextInt();
			suma += vNumeros[i];
		}
		media = suma/vNumeros.length;
		return media;
	}
	
	public static void main(String[] args) {
		// Ejercicio 2 de 1.3

		int med=0;
		
		med = media();
		
		System.out.println("La media de tus numeros es "+med);
	}

}
