import java.util.Scanner;

public class Ejemplo_funcion {

	public static void sumaParImpar(int a, int b) {
		

		int suma_pares = 0, suma_impares = 0;

		
		for (int i= a; i <= b; i++) {

			if (i % 2 == 0) {

				suma_pares += i;

			} else {

				suma_impares += i;

			}

		}

		System.out.println("La suma de los numeros pares hasta el 100 es " + suma_pares);
		System.out.println("La suma de los numeros impares hasta el 100 es " + suma_impares);

	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		int num1, num2, min=99999999, max=-999999;
		
		
		System.out.println("Dime dos numeros");
		num1 = leer.nextInt();
		num2 = leer.nextInt();
		
		
		if (num1 < min) {
			min = num1;
		}
		
		if (num2 < min) {
			min = num2;
		}
		
		if (num1 > max) {
			max = num1;
		}
		
		if (num2 > max) {
			max = num2;
		}
		
		sumaParImpar(min,max);
		
	}

}
