package Ejercicios_1_3;

import java.util.Scanner;

public class Ejercicio5_1_3 {

	public static void mostrarDatos(String vPersona[][]) {
		
		for (int i = 0; i < vPersona.length; i++) {
			for (int j = 0; j < vPersona[i].length; j++) {
				
				if (j==0) {
					System.out.print("El nombre de la persona "+(i+1)+" es "+vPersona[i][j]);
				} else {
					System.out.println(" y su edad es "+vPersona[i][j]);
				}
				
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		// Ejercicio 5 de 1.3

		Scanner leer = new Scanner(System.in);
		
		int tam=0;
		
		System.out.println("Dime el numero de cuantas personas quieres guardar informacion");
		tam = leer.nextInt();
		
		String vPersona[][] = new String[tam][2];
		
		for (int i = 0; i < vPersona.length; i++) {
			for (int j = 0; j < vPersona[i].length; j++) {
				if (j==0) {
					System.out.println("Dime el nombre de la persona "+(i+1));
					vPersona[i][j]= leer.next();
				}else {
					System.out.println("Dime la edad de la persona "+(i+1));
					vPersona[i][j]= leer.next();
				}
			}
		}
		
		mostrarDatos(vPersona);
		
		
	}

}
