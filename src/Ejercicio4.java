import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userData = JOptionPane.showInputDialog(null, "CALCULO FACTORIAL", "Introduzca un número ");
		int parsedNum = Integer.parseInt(userData);
		mostrarFactorial(parsedNum);

	}
	
	public static int factorial (int numero) {
		  if (numero==0)
		    return 1;
		  else
		    return numero * factorial(numero-1);
		}

	public static void mostrarFactorial(int userNum) {
	
		JOptionPane.showMessageDialog(null," El factorial de "+userNum+" es "+ factorial(userNum));
			
	}

}
