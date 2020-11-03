import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		// Ejercicio 4
		
		Scanner leer = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.println("Dime tres numeros");
		num1 = leer.nextInt();
		num2 = leer.nextInt();
		num3 = leer.nextInt();
		
		
		if (num1>num2 && num1>num3) {
			
			System.out.println(num1 + " es el numero mas grande");
			
		} else if (num2>num1 && num2>num3) {
			System.out.println(num2 + " es el numero mas grande");
		}else {
			System.out.println(num3 + " es el numero mas grande");
		}
		
		
	}

}
