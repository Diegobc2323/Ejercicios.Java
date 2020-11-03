import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Ejercicio 2

		float num1, num2;
		
		Scanner leer = new Scanner(System.in);
		
		
		System.out.println("Dime el primer numero");
		num1 = leer.nextInt();
		System.out.println("Dime el primer numero");
		num2 = leer.nextInt();
		
		System.out.println("La suma de "+num1+" y "+ num2 +" es igual a "+ (num1+num2));
		System.out.println("La resta de "+num1+" y "+ num2 +" es igual a "+ (num1-num2));
		System.out.println("La multiplicacion de "+num1+" y "+ num2 +" es igual a "+ (num1*num2));
		
		float division=(num1/num2);
		
		System.out.println("La division de "+num1+" y "+ num2 +" es igual a "+ division);
	}

}
