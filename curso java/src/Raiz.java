import java.util.Scanner;
public class Raiz {

	public static void main(String[] args) {
	   
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Inresar un numero");
		int number = leer.nextInt();
		
		while(number >=0) {
	
          System.out.println("Raiz: "+ number*number);
          
          System.out.println("Ingresar un numero");
          number = leer.nextInt();	
		}
		System.out.println("El numero es negativo");
		

	}

}
