import java.util.Scanner;

public class Ejercicio7_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
		int suma_pares = 0, suma_impares = 0;
		
		
		for (int i = 1; i <= 100; i++) {
			
			if (i%2==0) {
				
				suma_pares = suma_pares+i;
				
			} else {
				
				suma_impares = suma_impares+i;
				
			}
			
		}
		
		System.out.println("La suma de los numeros pares hasta el 100 es "+suma_pares);
		System.out.println("La suma de los numeros impares hasta el 100 es "+suma_impares);
		
	}

}
