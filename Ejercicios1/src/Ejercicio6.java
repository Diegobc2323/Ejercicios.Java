import java.util.Scanner;


public class Ejercicio6 {

	public static void main(String[] args) {
		// Ejercicio 6
		Scanner leer = new Scanner(System.in);
		
		float num;
		
		System.out.println("Dime un numero, si es negativo el programa no hara nada"
				+ " pero si es positivo, te dare su potencia de dos y su raiz cuadrada");
		num = leer.nextFloat();
		
		if (num<=0) {
			System.out.println("Error");
		} else {
			System.out.println("Del numero "+num+", su potencia es "+(num*num)+" y su raiz cuadrada es "+(Math.pow(num, 0.5)));
		}
		
	}

}
