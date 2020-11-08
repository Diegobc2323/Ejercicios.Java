import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Ejercicio 10

		Scanner leer = new Scanner(System.in);
		
		int num;
		System.out.println("Dime un numero y si no es cero te dire si es par o impar");
		num = leer.nextInt();
		
		while (num==0) {
			System.out.println("Dime otro numero");
			
			num = leer.nextInt();
		}
		
		if (num%2==0){
			
			System.out.println("tu numero es par");
			
		}else {
			System.out.println("tu numero es impar");
		}
		
	}

}
