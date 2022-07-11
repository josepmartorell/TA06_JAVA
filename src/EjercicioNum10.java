import java.util.Arrays;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EjercicioNum10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int parsedData[] = new int[3];
		
		String userData = JOptionPane.showInputDialog(null,"Introduzca el tamaño del array\n", "ARRAY NÚMEROS PRIMOS",JOptionPane.QUESTION_MESSAGE);
				 
		if(userData != null){
			
			  parsedData[0] = Integer.parseInt(userData);
			
			  JTextField limiteMinTextField = new JTextField(5);
			  JTextField LimiteMaxTextField = new JTextField(5);
				
			  JPanel myPanel = new JPanel();
			  myPanel.add(new JLabel("limite inferior"));
			  myPanel.add(limiteMinTextField);
			  myPanel.add(Box.createHorizontalStrut(15)); 
			  myPanel.add(new JLabel("limite superior"));
			  myPanel.add(LimiteMaxTextField);
			
			  int result = JOptionPane.showConfirmDialog(null, myPanel, "ARRAY NÚMEROS PRIMOS", JOptionPane.OK_CANCEL_OPTION);
			  if (result == 0) {
			      if (result == JOptionPane.OK_OPTION) {
			          parsedData[1] = Integer.parseInt(limiteMinTextField.getText());
			          parsedData[2] = Integer.parseInt(LimiteMaxTextField.getText());
			       }
			} else {
				System.out.println("CANCELADO");// cerrar aplicativo 
			}

		}else{ // cerrar aplicativo
		   System.out.println("CANCELADO");
		}
		
		mostrarArray(rellenarArray(parsedData[0], parsedData[1], parsedData[2]));
	
	}
	
	public static int esMayor(int arrPrimos[]) {
		
		int mayor = arrPrimos[0];
		for (int x = 1; x < arrPrimos.length; x++) {
			if (arrPrimos[x] > mayor) {
				mayor = arrPrimos[x];
			}
		}
		return mayor;
	}
	
	public static boolean esPrimo(int num) {	
	    for(int i=2;i<num;i++) {
	        if(num%i==0)
	            return false;
	    }
	    return true;
	}
	
	public static int[] rellenarArray(int arraySize, int limitInf, int limitSup) {		
		int arrPrimos[] = new int[arraySize];
		int i = 0;

	    for(int num=limitInf;num<limitSup;num++) {	    
	    	if(esPrimo(num) && i<arraySize) {
	    		arrPrimos[i] = num;
	    		i++;			    		
	    		
	    	}
	       	            
	    }
	    return arrPrimos;

	}
	
	public static void mostrarArray(int array[]) {
		
		JOptionPane.showMessageDialog(null, "Array números aleatorios: "+Arrays.toString(array).replace("[", "").replace("]", "")+" \nNÚMERO MAYOR: "+esMayor(array));
		
	}

}
