import java.util.Scanner;

public class Tarea3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Di un numero y te dire si es primo: ");
		int primo = sc.nextInt();
		Boolean esPrimo = true;

		if (primo < 2) {
			
			esPrimo = false;
		} else {
		
			for (int i = 2; primo > i; i++) {
				if (primo % i == 0) {
					esPrimo = false;
				}
			}
		}
		if (esPrimo) {
			System.out.println("Es primo");
		} else {
			System.out.println("No es primo");
		}
		sc.close();

	}

}
