import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int parsedData;
		
		do {
			String userData = JOptionPane.showInputDialog(null, "CONTAR CIFRAS", "Introduzca un número");
			parsedData = Integer.parseInt(userData);
		} while (parsedData <= 0); // si es negativo vuelve a mostra el cuadro de diálogo
		
		numCifras(parsedData);

	}
	
	public static void numCifras(int userNum) {
		
		int numIntroducido = userNum;
		int cifras= 0;   
		while(userNum!=0){          
			userNum = userNum/10;       
			cifras++;          
        }
		
		JOptionPane.showMessageDialog(null, "Cantidad de cifras del número "+numIntroducido+" igual a "+cifras);
	}

}
