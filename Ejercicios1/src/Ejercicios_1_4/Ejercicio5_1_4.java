package Ejercicios_1_4;

import java.util.Scanner;

public class Ejercicio5_1_4 {

	public static void main(String[] args) {
		// Ejercicio 5 de 1.4
		Scanner leer = new Scanner(System.in);
		
		String frase = "";
		int cont =0;
		
		System.out.println("Dime una frase y te dire cuantas palabras tiene");
		frase = leer.nextLine();
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.substring(i-1,i).equals(" ") && !frase.substring(i,i+1).equals(" ") && i!=0) {
				cont +=1;
			}
		}
		
	}

}