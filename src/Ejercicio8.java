import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]userArr = rellenarArray();
		mostrarArray(userArr);
		
	}
	
	public static int[] rellenarArray() {
		
		int num[] = new int[10];
		int i = 0;
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Introduzca 10 posiciones números enteros de uno en uno:");
		while (i<num.length) {

			num[i] = sc.nextInt(); 
			sc.nextLine(); //limpiar buffer
			i++;
		}
	    sc.close();
	    return num;
	}
	
    public static void mostrarArray(int[] numArr) {
    	
		int i = 0;

    	System.out.println("Mostrando las posiciones y los valores del array...");
    	for(int j = 0; j<numArr.length; j++) {
    		System.out.println("Indice "+(j+1)+" valor: "+numArr[j]);
    	};
  
    }
    
}

