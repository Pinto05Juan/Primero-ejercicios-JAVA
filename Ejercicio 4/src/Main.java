import java.util.Scanner;

public class Main {
	public static void main(String[ ] args) {
		Scanner sc = new Scanner(System.in);
		int numero1, numero2;
		int opcion=0, respuesta;
		float resultado;
		
		System.out.println("Ingrese un numero: ");
		numero1 = sc.nextInt();
		System.out.println("Ingrese un numero: ");
		numero2 = sc.nextInt();
		
		do {
			System.out.println("Ingrese que caso quiere hacer: 1- Sumar 2- Resta 3- Multiplicar 4- Dividir (0- Si quiere salir)");
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1:
				resultado = numero1 + numero2;
				System.out.println("El resultado es " + resultado);
				break;
			case 2:
				resultado = numero1 - numero2;
				System.out.println("El resultado es " + resultado);
				break;
			case 3:
				resultado = numero1 * numero2;
				System.out.println("El resultado es " + resultado);
				break;
			case 4:
				resultado = numero1 / numero2;
				System.out.println("El resultado es " + resultado);
				break;
			default:
				if(opcion > 0) {
					System.out.println("Opcion no valida");
					continue;
				}
			}
				System.out.println("Quiere ingresar otros numeros: 1- Si 0- No");
				respuesta = sc.nextInt();
				
				if(respuesta == 1) {
					System.out.println("Ingrese un numero: ");
					numero1 = sc.nextInt();
					System.out.println("Ingrese un numero: ");
					numero2 = sc.nextInt();
					continue;
				}
			
		} while(opcion != 0);
		
		sc.close();
	}
}
