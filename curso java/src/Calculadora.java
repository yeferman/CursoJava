import javax.swing.JOptionPane;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         int resultado = 0;
         float division=0;
   
         
	
		 String operacion = JOptionPane.showInputDialog("Especifique el tipo de operacion:"
		 		+ " \nSuma (S) \nResta(R) \nMultiplicación (M/P) \nDivision (D)");
		  
		
		 
		 if((operacion.equalsIgnoreCase("S") == true) || (operacion.equalsIgnoreCase("R") == true) || (operacion.equalsIgnoreCase("M") == true) || (operacion.equalsIgnoreCase("P") == true) ||
		 (operacion.equalsIgnoreCase("D") == true)){
		
			 int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer  numero"));
			 int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
			 
		
		 if(operacion.equalsIgnoreCase("S") == true) {
			 resultado= numero1+numero2;
			 
		 }else if(operacion.equalsIgnoreCase("R")==true) {
			 resultado = numero1-numero2;
			 
		 }else if((operacion.equalsIgnoreCase("M")==true) || (operacion.equalsIgnoreCase("P")==true)){
			 resultado = numero1*numero2;
			 
		 }else if((operacion.equalsIgnoreCase("D")==true)){
			 
			 resultado= numero1/numero2;
			 
		 }
		 
		JOptionPane.showMessageDialog(null,"El resultado de la operacione es: " + resultado);
	}else {
		JOptionPane.showMessageDialog(null,"Ha ingresado una operación ivalida");
	}
		 
	}

}
