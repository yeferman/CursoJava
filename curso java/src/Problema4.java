import java.util.Scanner;

public class Problema4 {

	public static void main(String[] args) {
     
		Scanner leer = new Scanner(System.in);
		
		double salario = 1000;
		
		System.out.println("Cantidad carros vedidos");
		int vendidos = leer.nextInt();
		
		System.out.println("Valor de ventas");
		double valor = leer.nextDouble();
		
		double comicion = vendidos*150;
		double porsentaje = valor*0.05; 
		double total = salario+comicion+porsentaje;
        
		System.out.println("Salario: " + total);
	}

}
