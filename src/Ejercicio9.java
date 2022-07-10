import java.util.Arrays;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int parsedData[] = new int[3];
		
		String userData = JOptionPane.showInputDialog(null,"Introduzca el tamaño del array\n", "ARRAY NÚMEROS ALEATORIOS",JOptionPane.QUESTION_MESSAGE);
		
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
			
			  int result = JOptionPane.showConfirmDialog(null, myPanel, "ARRAY NÚMEROS ALEATORIOS", JOptionPane.OK_CANCEL_OPTION);
			  if (result == 0) {
				  
			      if (result == JOptionPane.OK_OPTION) {
			          parsedData[1] = Integer.parseInt(limiteMinTextField.getText());
			          parsedData[2] = Integer.parseInt(LimiteMaxTextField.getText());
			       }
			      
			      rellenarArray(parsedData[0], parsedData[1], parsedData[2]);
				
			} else {
				System.out.println("CANCELADO");// cerrar aplicativo 
			}

		      
	      
		}else{ // cerrar aplicativo
			   System.out.println("CANCELADO");
		}


	}
	
	public static void rellenarArray(int arraySize, int limitInf, int limitSup) {
		
		int arr[] = new int[arraySize];
		for(int i = 0; i<arraySize; i++)
		     arr[i] = (int)(Math.random()*(limitSup-limitInf+1)+limitInf);
		mostrarArray(arr);
	
	
	}
	public static void mostrarArray(int array[]) {
		
		int arrayLength = array.length;
		int suma = 0;
		int i = 0;
		
		while(arrayLength != 0) {
			suma = suma+array[i];
			arrayLength--;
			i++;
		}
		JOptionPane.showMessageDialog(null, "Array números aleatorios: "+Arrays.toString(array).replace("[", "").replace("]", "")+" \nTOTAL:"+suma);
		
	}
}
