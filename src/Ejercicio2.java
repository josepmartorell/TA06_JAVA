
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cantidadNumero = JOptionPane.showInputDialog("Introduzca la cantidad a mostrar de números aleatorios\n");
		String limiteInferior = JOptionPane.showInputDialog("Introduzca el limite inferior del numero aletorio a obtener");
		String limiteSuperior = JOptionPane.showInputDialog("Introduzca el llimite superior del numero aletorio a obtener");
		
		int cantidadNum = Integer.parseInt(cantidadNumero);
		int limiteInf = Integer.parseInt(limiteInferior);	
		int limiteSup = Integer.parseInt(limiteSuperior);
		
		numAleatorioLimitado(cantidadNum, limiteInf, limiteSup);


	}
	
	public static void numAleatorioLimitado (int cantidad, int limiteSup, int limiteInf) {

			int arr[] = new int[cantidad];
			for(int i = 0; i<cantidad; i++)
			     arr[i] = (int)(Math.random()*(limiteSup-limiteInf+1)+limiteInf);

			JOptionPane.showMessageDialog(null, "La secuencia de números aleatorios es: "+Arrays.toString(arr).replace("[", "").replace("]", ""));
		}
	
		
		
	}
	



