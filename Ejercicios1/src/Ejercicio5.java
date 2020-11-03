import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Ejercicio 5
		Scanner leer = new Scanner(System.in);
		
		int num1,num2,num3;
		
		System.out.println("Dime tres numeros. Si el primero"
				+ " es negativo te dare su producto, sino"
				+ " te dare su suma");
		num1 = leer.nextInt();
		num2 = leer.nextInt();
		num3 = leer.nextInt();
		
		if (num1<0) {
			System.out.println("El producto de los tres numeros "
					+ "es " + (num1*num2*num3));
		} else {
			System.out.println("La suma de los tres numeros "
					+ "es " + (num1+num2+num3));
		}
		
	}

}
