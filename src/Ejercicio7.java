import javax.swing.JOptionPane;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int parsedData1;
		do {			
			String userData1 = JOptionPane.showInputDialog(null, "Seleccione el tipo de conversión 1-(euro/libra) 2-(euro/dolar) 3-(euro/yen)", "CONVERSOR EUROS", JOptionPane.INFORMATION_MESSAGE);
	        parsedData1= Integer.parseInt(userData1);
		}while(parsedData1 < 1 || parsedData1 > 3);	
		String userData2 = JOptionPane.showInputDialog(null, "Introduzca la cantidad", "CONVERSOR EUROS", JOptionPane.INFORMATION_MESSAGE);
		int parsedData2 = Integer.parseInt(userData2);
		conversorEuros(parsedData2, parsedData1);
		
	}
	
	public static void conversorEuros(float cantidadEur, int tipoMoneda) {
		
		float result = 0;
		String conversion = "";

		switch(tipoMoneda) {
			case 1:
				result = (float) (cantidadEur * 0.89);
				conversion = "libras";			
				break;
			case 2:
				result = (float) (cantidadEur * 1.28611);
				conversion = "dolares";
				break;
			case 3:
				result = (float) (cantidadEur * 129.852);
				conversion = "yenes";
				break;

		
		}
		JOptionPane.showMessageDialog(null, cantidadEur+" € equivalen a "+result+" "+conversion);
	
	}

}
