package Ejercicios_1_4;

import java.util.Scanner;

public class Ejercicio1_1_4 {

	public static void main(String[] args) {
		// Ejercicio 1 de 1.4
		Scanner leer = new Scanner(System.in);
		String nombre="";
		
		System.out.println("Dime tu nombre");
		nombre = leer.nextLine();
		
		for (int i = nombre.length()-1; i >= 0 ; i--) {
			
			if (i==0) {
				System.out.print(nombre.substring(i,i+1).toUpperCase());
				
			}else {
				System.out.print(nombre.substring(i,i+1).toLowerCase());
			}
			
			
		}
	}

}
