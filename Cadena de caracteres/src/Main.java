import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			var sc = new Scanner(System.in);
			System.out.println("Ingrese su nombre: ");
			
			var nombre = sc.nextLine();
			System.out.println("Tu nombre es " + nombre);
			
			sc.close();
	}
}
