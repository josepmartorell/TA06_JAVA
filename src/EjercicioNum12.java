import java.util.Arrays;
import javax.swing.JOptionPane;

public class EjercicioNum12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userData;
		int arrayX[];
		int arrayDigit[];
		
		// PEDIMOS EL TAMAÑO DEL ARRAY QUE VAMOS A CREAR
		userData = JOptionPane.showInputDialog(null, "Introduzca el tamaño del array", 
				"ARRAY MANAGER", JOptionPane.INFORMATION_MESSAGE);
		// INICALIZAMOS EL ARRAY CON NÚMEROS ALEATORIOS DEL 1 AL 300
		arrayX = inicializarArray(userData);
		// MOSTRAMOS ESTE NUEVO ARRAY PARA COMPROBAR SI ALGUNO TERMINA EN EL DÍGITO QUE EL USUARIO PUEDA ELEGIR
		mostrarArray(arrayX);
		// PEDIMOS INTRODUCIR UN DIGITO NUMÉRICO
		userData = JOptionPane.showInputDialog(null, "Introduzca un dígito numérico");
		// MOSTRAMOS TODAS LAS CIFRAS QUE TERMINAN CON EL DIGITO INTRODUCIDO
		mostrarArrayDigito(arrayX, userData);
		// GUARDAMOS TODAS LAS CIFRAS EN UN NUEVO ARRAY
		arrayDigit = guardarArrayDigito(arrayX, userData);
		

	}
	
	public static int[] inicializarArray(String arraySize) {
		 
		int parsedData = Integer.parseInt(arraySize);
		int array[] = new int[parsedData];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*(300-1+1)+1);
		}
		return array;
		
	}
	
	public static void mostrarArray(int array[]) {
		
		JOptionPane.showMessageDialog(null, 
				"Array : "+Arrays.toString(array).replace("[", "").replace("]", "")+"\n", 
				"MOSTRAMOS EL ARRAY", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	public static void mostrarArrayDigito(int[] array, String digit) {
		
		int digito = 0;
		int count = 0;
	    int arrayDigitos[];
	    
		for (int i = 0; i < array.length; i++) {
			digito = array[i] % 10;
			if (digito == Integer.parseInt(digit)) {
				count++;
			}
			
		}
		
		int j = 0;
		arrayDigitos = new int[count];
		for (int i = 0; i < array.length; i++) {
			digito = array[i] % 10;
			if (digito == Integer.parseInt(digit)) {
				arrayDigitos[j] = array[i];
				j++;
			}
			
		}
						
		JOptionPane.showMessageDialog(null, "Array "+Arrays.toString(arrayDigitos).replace("[", "").replace("]", ""), "MOSTRAR TERMINADOS CON DIGITO", JOptionPane.INFORMATION_MESSAGE);
					
	}
	
	public static int[] guardarArrayDigito(int[] array, String digit) {
		
		int digito = 0;
		int count = 0;
	    int arrayDigitos[];
	    
		for (int i = 0; i < array.length; i++) {
			digito = array[i] % 10;
			if (digito == Integer.parseInt(digit)) {
				count++;
			}
			
		}
		
		int j = 0;
		arrayDigitos = new int[count];
		for (int i = 0; i < array.length; i++) {
			digito = array[i] % 10;
			if (digito == Integer.parseInt(digit)) {
				arrayDigitos[j] = array[i];
				j++;
			}
			
		}
						
		JOptionPane.showMessageDialog(null, "ARRAY GUARDADO CON ÉXITO!");
		return arrayDigitos;
					
	}
	
	
	

}
