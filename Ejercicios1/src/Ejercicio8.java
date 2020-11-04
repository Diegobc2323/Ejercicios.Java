import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Ejercicio 8
		Scanner leer = new Scanner(System.in);
		
		float importe;
		String mes, comprobacion;
		
		comprobacion="octubre";
		
		System.out.println("Importe de la compra");
		
		importe = leer.nextFloat();
		
		System.out.println("mes en el ques estamos");
		
		mes = leer.next();
		
		mes = mes.toLowerCase();
		
		System.out.println(mes);
		
		if (mes==comprobacion) {
			
			System.out.println("Se le aplicara un descuento de un 15% a su importe");
			System.out.println("De "+importe+"€ pasa a ser "+(importe*0.85)+"€");
			
		}else {
			
			System.out.println("Tu importe total es de "+importe+"€");
			
		}
		
	}
	
}
