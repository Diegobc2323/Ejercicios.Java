import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// Ejercicio 13

		Scanner leer = new Scanner(System.in);
		
		int num, i=1, resultado=0;
		
		System.out.println("Dime un numero y te dire cuanto es la suma de todos sus numeros anteriores");
		num = leer.nextInt();
		
		while (i<=num) {
			resultado = resultado + i;
			i++;
		}
	
		System.out.println("La suma de todos los numeros hasta "+num+" es "+resultado);
	}
	}
