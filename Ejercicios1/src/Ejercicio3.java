import java.util.Scanner;


public class Ejercicio3 {

	public static void main(String[] args) {
		// Ejercicio 3

		
		int num1=0, num2=0;
		Scanner leer = new Scanner(System.in);
		
			
		System.out.println("Dime un numero");
		num1 = leer.nextInt();
		
		System.out.println("Dime un numero");
		num2 = leer.nextInt();
		
		if (num1>num2) {
			
			System.out.println(num1 + " es mayor que "+num2);
		
		}else {
			
			System.out.println(num2 + " es mayor que "+num1);
			
		}
			
	}

}
