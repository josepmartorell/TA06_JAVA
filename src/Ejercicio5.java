import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userData = JOptionPane.showInputDialog(null, "CONVERSOR BASE DECIMAL/BINARIO", "Introduzca un número ");
		int parsedNum = Integer.parseInt(userData);
		mostrarBinario(parsedNum);

	}
	
	public static String convertirBinario (int num) {
		
        int residuo;
        int exponente=0;
        int binario=0;
        while(num!=0){
                residuo = num % 2;            
                binario = (int) (binario + residuo * Math.pow(10, exponente));  
                exponente++;
                num = num/2; 
        }
        String numCadena= String.valueOf(binario);
        
		return numCadena;
		
		}

	public static void mostrarBinario(int userNum) {
	
		JOptionPane.showMessageDialog(null," El binario del número decimal "+userNum+" es "+ convertirBinario(userNum));
			
	}
	
	

}
