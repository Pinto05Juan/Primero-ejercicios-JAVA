import java.util.Scanner;

public class Main {
	public static String cadena_nueva(String cadena, char caracter_viejo, char cadena_nueva) {
		return cadena.replace(caracter_viejo, cadena_nueva);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.println("Ingrese una palabra: ");
		var palabra = sc.nextLine();
		
		System.out.println("Ingrese el caracter que quiere reemplazar: ");
		var caracter = sc.nextLine().charAt(0);
		
		System.out.println("Ingrese el caracter nuevo: ");
		var nuevo = sc.nextLine().charAt(0);
		
		String nueva_palabra = cadena_nueva(palabra, caracter, nuevo);
		
		System.out.println("Nueva cadena: " + nueva_palabra);
		sc.close();
	}

}
