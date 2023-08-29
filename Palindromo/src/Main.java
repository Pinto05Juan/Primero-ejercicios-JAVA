import java.util.Scanner;

public class Main {
	public static boolean palindromo(String palabra) {
		for(int i=0; i < palabra.length();i++) {
			if(palabra.charAt(i) != palabra.charAt(palabra.length()-i-1)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);

		System.out.println("Ingrese una palabra: ");
		var palabra = sc.nextLine();
		
		System.out.println(palindromo(palabra));
		
		sc.close();
	}

}
