import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// Ejercicio 17
		
		Scanner leer = new Scanner(System.in);
		
		int num, min = 99999999, max=0, suma=0, contador=0;
		
		System.out.println("Dime una serie de numeros y te dare una serie de informacion cuando teclees el numero 0");
		num = leer.nextInt();
		
		while (num!=0) {
			
			if (min>num) {
				min=num;
			}
			
			if (max<num) {
				max=num;
			}
			
			suma += num;
			
			contador++;
			
			num = leer.nextInt();
		}
		
		System.out.println("De los numeros que me has dado "+min+" es el numero mas pequeño");
		System.out.println("De los numeros que me has dado "+max+" es el numero mas grande");
		System.out.println("La media de tus numeros es "+(suma/contador));
		
		
	}

}
