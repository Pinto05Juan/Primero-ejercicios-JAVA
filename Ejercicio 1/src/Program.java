import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		do {
			System.out.println("Ingrese un numero del 1 - 100: ");
			number = sc.nextInt();
			
			if(number < 0 || number > 100) {
				System.out.println(number + " no es valido");
				continue;
			}
			
			if(number % 2 == 0 && number != 0) {
				System.out.println("El numero " + number + " es par");
			} 
		} while(number != 0);
		
		sc.close();
	}
}
