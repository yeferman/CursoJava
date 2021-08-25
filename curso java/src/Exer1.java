import javax.swing.*;

public class Exer1 {

	public static void main(String[] args) {
/*
		    1. Desarrolle un algoritmo que permita capturar dos números y realice las siguientes validaciones: 
			a.  Si son iguales los multiplica 
			b.  Si el primero es mayor que el segundo los resta 
			c.  Si el primero es menor que el segundo los suma
		 */
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1"));
		
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2"));
		
		int resultado = 0;
		
		
		if(num1 == num2) {
			
			resultado = num1* num2;
		 
		}else if(num1 > num2) {
			
		resultado = num1-num2;
		
		}else if(num1 < num2) {
			
			resultado = num1+num2;
		}
		
		System.out.print("el resultado es: "+ resultado);
         
	}

}
