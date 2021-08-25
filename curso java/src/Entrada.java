
import java.util.Scanner;

public class Entrada {
	
	public static void main(String args[]) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Digite su nombre (:");
		String nombre = leer.nextLine();
		
		System.out.println("Mimbre es: " + nombre );
		
		System.out.println("Escoge una opción:  \nopcion 1  \nopcion 2  \nopcion 3");
		
		
	}

}
