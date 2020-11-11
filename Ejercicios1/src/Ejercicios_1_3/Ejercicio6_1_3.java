package Ejercicios_1_3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio6_1_3 {

	public static void mostrarTabla(int vTabla[][]) {
		
		for (int i = 0; i < vTabla.length; i++) {
			for (int j = 0; j < vTabla[i].length; j++) {
				System.out.print(vTabla[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void rellenarTabla(int vTabla[][]) {
		
		Random azar = new Random();
		
		for (int i = 0; i < vTabla.length; i++) {
			for (int j = 0; j < vTabla[i].length; j++) {
				vTabla[i][j]= azar.nextInt(10);
			}
		}
		
		mostrarTabla(vTabla);
		
	}
	
	
	public static void main(String[] args) {
		// Ejercicio 6 de 1.3
		Scanner leer = new Scanner(System.in);
		int filas=0, columnas=0;
		
		
		System.out.println("Dime cuantas filas tendra tu tabla");
		filas = leer.nextInt();
		
		System.out.println("Dime cuantas columnas tendra tu tabla");
		columnas = leer.nextInt();
		
		int vTabla[][] = new int[filas][columnas];
		
		rellenarTabla(vTabla);
		
	}

}
