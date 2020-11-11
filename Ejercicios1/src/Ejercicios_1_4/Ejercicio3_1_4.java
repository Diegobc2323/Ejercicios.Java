package Ejercicios_1_4;

import java.util.Scanner;

public class Ejercicio3_1_4 {

	public static void main(String[] args) {
		// Ejercicio 3 de 1.4
		Scanner leer = new Scanner(System.in);
		String nombre="", vocales="aeiou";
		int cont=0;
		
		System.out.println("Dime tu nombre y te dire cuantas vocales tiene");
		nombre = leer.nextLine();
		
		for (int i = 0; i < nombre.length(); i++) {
			for (int j = 0; j < vocales.length(); j++) {
				if (nombre.substring(i,i+1).equalsIgnoreCase(vocales.substring(j,j+1))){
					cont+=1;
				}
			}
		}
		System.out.println("Tu nombre tiene "+cont+" vocales");
	}

}
