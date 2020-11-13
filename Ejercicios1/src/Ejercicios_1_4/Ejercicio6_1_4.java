package Ejercicios_1_4;

import java.util.Scanner;

public class Ejercicio6_1_4 {

	public static String quitarEspaciosPrincipio(String nombre) {
		
		String nombre_nuevo="";
		int inicio=0, fin=nombre.length();
		
		if (nombre.substring(0,1).equals(" ")) {
			for (int i = 0; !nombre.substring(i,i+1).equals(" "); i++) {
				inicio ++;
			}
			inicio++;
		}
		
		if (nombre.substring(fin-1, fin).equals(" ")) {
			for (int i = nombre.length(); !nombre.substring(i-1,i).equals(" "); i--) {
				fin--;
			}
			fin--;
		}
		
		
		for (int i = inicio; i < fin; i++) {
			if (!(i!=0 && nombre.subSequence(i, i+1).equals(" ") && nombre.subSequence(i-1, i).equals(" "))) {
				
				nombre_nuevo+= nombre.substring(i,i+1);
			}
		}
		
		
		
	
		
		
		
		return nombre_nuevo;
	}

	public static void main(String[] args) {
		// Ejercicio 6 de 1.4

		Scanner leer = new Scanner(System.in);

		String nombre = "";

		nombre = leer.nextLine();

		nombre = quitarEspaciosPrincipio(nombre);

		System.out.println(nombre);

		/*
		 * for (int i = 0; i < nombre.length(); i++) { if (i==0 ||
		 * (nombre.substring(i-1,i).equals(" ") &&
		 * !nombre.substring(i,i+1).equals(" "))) {
		 * System.out.print(nombre.substring(i,i+1).toUpperCase()); } else {
		 * System.out.print(nombre.substring(i,i+1).toLowerCase()); } }
		 */
	}

}
