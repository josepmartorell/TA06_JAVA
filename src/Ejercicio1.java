import java.lang.Math;
import java.util.Scanner;


public class Ejercicio1 {
	

	private static final double PI = 3.1416;
	private static Scanner sc;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    sc = new Scanner(System.in);
		System.out.println("Introduzca tipo de área a calcular (1=círculo, 2=triángulo o 3=cuadrado)");
		int opcion = sc.nextInt();
		
		switch(opcion) {
		case 1:
			calculaAreaCirculo();
			break;
		case 2:
			calculaAreaTriangulo();
			break;
		case 3:
			calculaAreaCuadrado();
			break;
			default:
				System.out.println("Opción introducida erronea");


		}


	}
	
	public static void calculaAreaCirculo() {	
			
		System.out.println("Itroduzca el rádio del círculo\n");
		int radio = sc.nextInt();
		double result = (radio^2) * PI;
		System.out.println("El área del círculo es: "+result);	
		
	}
	
	public static void calculaAreaTriangulo() {	

		System.out.println("Itroduzca la base del triángulo\n");
		int base = sc.nextInt();
		System.out.println("Itroduzca la altura del triángulo\n");
		int altura = sc.nextInt();
		double result = (base * altura) / 2; 
		System.out.println("El área del triangulo es: "+result);	
	
	}
	
	public static void calculaAreaCuadrado() {	

		System.out.println("Itroduzca el lado del cuadrado\n");
		int lado = sc.nextInt();
		double result =  lado * lado;
		System.out.println("El área del cuadrado es: "+result);	
	
	}

}
