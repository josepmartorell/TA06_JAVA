import java.util.Arrays;
import javax.swing.JOptionPane;

public class EjercicioNum11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int parsedData[] = new int[2];
		int array1[];
		int array2[];
		
		String userData = JOptionPane.showInputDialog("Introduzca el tamaño del array 1");
		parsedData[0] = Integer.parseInt(userData);
		// INICIALIZAMOS ARRAY 1 CON NÚMENROS ALEATORIOS
		array1 = inicializarArray(parsedData[0]);
		// APUNTAMOS EL ARRAY 2 HACIA EL ARRAY 1
		array2 = array1;
		// REASIGNAMOS LOS VALORES DEL SEGUNDO ARRAY
		array2 = inicializarArray(array1.length);
		// MULTIPLICAMOS CADA VALOR DEL ARRAY 1 CON CADA VALOR DEL ARRAY 2 Y LO MOSTRAMOS
		mostrarArrayProducto(array1, array2);
		// MOSTRAMOS EL CONTENIDO INDEPENDIENTE DE LOS DOS ARRAYS
		mostrarArrays(array1, array2);

	}
	
	public static int[] inicializarArray(int arraySize) {
		 
		int array[] = new int[arraySize];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*9);
		}
		return array;
		
	}
	
	public static void mostrarArrayProducto(int array1[], int array2[]) {
		
		int array3[] = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			array3[i] = array1[i]*array2[i];
			
		}
		JOptionPane.showMessageDialog(null, "Array3 : "+Arrays.toString(array3).replace("[", "").replace("]", ""), "OPERACIONES CON ARRAYS", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	public static void mostrarArrays(int array1[], int array2[]) {
		
		JOptionPane.showMessageDialog(null, 
				"Array1 : "+Arrays.toString(array1).replace("[", "").replace("]", "")+"\n"+
				"Array2 : "+Arrays.toString(array2).replace("[", "").replace("]", ""), 
				"OPERACIONES CON ARRAYS", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	
	
}
