import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		
		
		int num;
		
		
		System.out.println("Dime un numero y te dire si es par o impar");
		num = leer.nextInt();
		
		if (num==0) {
		
			System.out.println("tu numero no es ni par ni impar");
			
		}else if (num%2==0){
			
			System.out.println("tu numero es par");
			
		}else {
			System.out.println("tu numero es impar");
		}
		
	}

}
