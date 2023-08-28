import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		int vocal=0;
		System.out.println("Ingrese una palabra: ");
		var palabra = sc.nextLine();
		
		for(var i = 0; i < palabra.length();i++) {
			if(palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i' || palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u') {
				vocal++;
			}
			
		}
		System.out.println("La palabra tiene " + vocal + " vocales");
		
		sc.close();
	}

}
