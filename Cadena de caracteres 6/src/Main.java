import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		int maximo = 0;
		String larga = "";
		for(int i = 0;i<5;i++) {
			System.out.println("Ingrese una palabra: ");
			var palabra = sc.nextLine();
			
			if(palabra.length() > maximo) {
				maximo = palabra.length();
				larga = palabra;
			}
		}
		
		System.out.println("La cadena mas larga es " + larga);
		sc.close();
	}

}
