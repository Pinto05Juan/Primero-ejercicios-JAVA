import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		boolean primo;
		
		do {
			primo=false;
			System.out.println("Ingrese un numero: ");
			number = sc.nextInt();
			
			
			for(int i = 1; i<=(number/2); i++) {
				if(number % i == 0) {
					primo = false;
				}
				
			} 
		} while(number < 100 && primo == false);	
		sc.close();
	}
}
	
