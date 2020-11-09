import java.util.Scanner;

public class EjemploMenu {

	public static int pintaMenu() {
		Scanner leer = new Scanner(System.in);
		int opc = 0;

		do {

			System.out.println("Opcion 1-Hola");
			System.out.println("Opcion 2-Si");
			System.out.println("Opcion 3-Salir");
			System.out.println("----------------");
			System.out.println("Dime una opcion");

			opc = leer.nextInt();
		} while (opc < 1 || opc > 3);

		return opc;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc;

		do {
			opc = pintaMenu();

			switch (opc) {
			case 1:
					System.out.println("Hola");
				break;

			case 2:
				System.out.println("Si");
				break;

			case 3:
				System.out.println("Salir");
				break;

			default:
				break;
			}
		} while (opc!=3);
		
		

	}
}
