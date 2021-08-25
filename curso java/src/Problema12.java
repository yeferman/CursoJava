import java.util.Scanner;
public class Problema12 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
	int number;
	int contador=0;
      
		do {
			System.out.println("Ingrese un numero");
			number = leer.nextInt();
			contador++;
			
		}while(number>=0);
		
		System.out.println("Se introdujeron_" + contador +" numeros");

	}

}
