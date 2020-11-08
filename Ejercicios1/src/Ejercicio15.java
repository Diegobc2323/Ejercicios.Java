import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// Ejercicio 15

		Scanner leer = new Scanner(System.in);
		
		int num, resultado=0;
		
		System.out.println("Dime varios numeros y te los sumare todos hasta que introduzcas un -1");
		num = leer.nextInt();
		
		while (num!=(-1)) {
			resultado += num;
			num = leer.nextInt();
		}
		
		System.out.println("La suma de todos los numeros es "+resultado);
	}

}
