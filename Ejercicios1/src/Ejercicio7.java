import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Ejercicio 7
		Scanner leer = new Scanner(System.in);
		
		float boys, girls, suma;
		
		System.out.println("Cuantos niños hay en tu clase?");
		
		boys = leer.nextFloat();
		
		System.out.println("Cuantos niñas hay en tu clase?");
		
		girls = leer.nextFloat();
		
		suma= boys + girls;
		
		System.out.println("El porcentaje de niños en tu clase es de un "+((boys/suma)*100)+"% y el de niñas es de un "+((girls/suma)*100)+"%");
	}

}
