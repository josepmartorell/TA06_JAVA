import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userData = JOptionPane.showInputDialog("Introduzca un número ");
		int parsedNum = Integer.parseInt(userData);
		if (numPrimo(parsedNum) != false)
			JOptionPane.showMessageDialog(null, parsedNum+" ES número primo");
		else
			JOptionPane.showMessageDialog(null, parsedNum+" NO es número primo");
		
		

	}
	
	public static boolean numPrimo(int num) {
		//
	    for(int i=2;i<num;i++) {
	        if(num%i==0)
	            return false;
	    }
	    return true;
	}

}
