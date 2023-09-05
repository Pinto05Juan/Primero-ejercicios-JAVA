import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static boolean anagrama(char[] palabra1, char[] palabra2) {
		if(palabra1.length != palabra2.length) {
			return false;
		}
		Arrays.sort(palabra1);
		Arrays.sort(palabra2);
		
		for( int i = 0;i<palabra1.length;i++) {
			if(palabra1[i] != palabra2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		
		System.out.println("Ingrese una palabra: ");
		var palabra1= sc.nextLine();
		
		System.out.println("Ingrese una palabra (de mismo tamanio que la primera): ");
		var palabra2 = sc.nextLine();
		
		System.out.println(anagrama(palabra1.toCharArray(), palabra2.toCharArray()));
		
		sc.close();
	}

}
