import java.util.Scanner;
public class NegativoPositivo {

	public static void main(String[] args) {
	       
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Inresar un numero");
		int number = leer.nextInt(); 	
		
		while((number <0) || (number>0)) {
			 
			if(number>0) {
				System.out.println("El "+number+ " es positivo");
				
			}else {
				System.out.println("El "+number+ " es negativo");
			}
			
			System.out.println("Inresar un numero");
			number = leer.nextInt(); 	
		}
		System.out.println("el numero ingresado es el: (cero)"+ number );

	}

}
