package Ejercicios_1_3;

import java.util.Scanner;

public class Ejercicio4_1_3 {

	public static void mostrarDatos(String vNombre[],int vEdad[]){
		
		for (int i = 0; i < vNombre.length; i++) {
			System.out.println("El nombre de la persona "+(i+1)+" es "+vNombre[i]+" y su edad es "+vEdad[i]);
		}
		
	}
	
	public static void main(String[] args) {
		// Ejercicio 4 de 1.3
		Scanner leer = new Scanner(System.in);
		
		int tam=0;
		
		System.out.println("Dime el numero de cuantas personas quieres guardar informacion");
		tam = leer.nextInt();
		
		
		String vNombre[] = new String[tam];
		int vEdad[] = new int[tam];
		
		for (int i = 0; i < vNombre.length; i++) {
			System.out.println("Dime el nombre de la persona "+(i+1));
			vNombre[i] = leer.nextLine();
			System.out.println("Dime la edad de la persona "+(i+1));
			vEdad[i] = leer.nextInt();
		}
		
		mostrarDatos(vNombre,vEdad);
		
	}

}
