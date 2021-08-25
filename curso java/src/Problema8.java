import java.util.Scanner;
public class Problema8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
          
	    System.out.println("Digite num 1");
	    int num1 = leer.nextInt();
	    
	    System.out.println("Digite num 2");
	    int num2 = leer.nextInt();
	    
	    if(num1 %2==0 && num2 %2==0) {
	    	System.out.println(num1 +" y "+ num2+ " son pares");
	    	
	    }else {
	    	System.out.println("Uno de los numeros no es par o ambos, no es par");
	    }
	    
	    
	}

}
