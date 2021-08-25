import java.util.Scanner;
public class Problema13 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int suma =0;
        int number;
        int contador=0;
		
		  
				do {
					System.out.println("Ingrese un numero");
					number = leer.nextInt();
					if(number>0) {
						suma+=number;
						contador++;
					}
					
					
				}while(number>0);
				
				System.out.println("La suma es igual a: "+ suma/contador);
	}

}
