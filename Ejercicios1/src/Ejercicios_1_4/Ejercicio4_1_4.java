package Ejercicios_1_4;

import java.util.Scanner;

public class Ejercicio4_1_4 {

	public static void main(String[] args) {
		// Ejercicio 4 de 1.4
		Scanner leer = new Scanner(System.in);
		String nombre="";
		String vocales="aeiou";
		
		System.out.println("Dime tu nombre y te dire que vocales usa");
		nombre = leer.nextLine();
		
		for(int i = 0; i<vocales.length(); i++) {
			for(int j = 0; j<nombre.length(); j++) {
				if (nombre.substring(j,j+1).equalsIgnoreCase(vocales.substring(i,i+1))) {
					
					System.out.print(vocales.substring(i,i+1));
					break;
				}
			}
		}
	}
}


