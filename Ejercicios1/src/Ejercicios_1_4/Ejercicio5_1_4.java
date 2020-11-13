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
		
		if (!frase.substring(0,1).equals(" ")) {
			cont=1;
		}
		
		for (int i = 0; i < frase.length(); i++) {
			
			if (i!=0 && (frase.substring(i-1,i).equals(" ") || frase.substring(i-1,i).equals("") && !frase.substring(i,i+1).equals(" "))) {
				cont +=1;
			}
		}
		System.out.println("Tu frase tiene "+cont+" palabras");
	}

}
