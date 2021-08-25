import java.util.Scanner;
public class Problema5 {

	public static void main(String[] args) {
		
      Scanner leer = new Scanner(System.in);
      
      System.out.println("Ingrese Num 1");
      int num1 = leer.nextInt();
      
      System.out.println("Ingrese Num 2");
      int num2 = leer.nextInt();
      
      if(num1 >num2) {
    	  System.out.println("El mayor es: " + num1);
    	  
      }else if(num2>num1){
    	  System.out.println("El mayor es: " + num2);
      }else {
    	  System.out.println(num1 + " Y " + num2 + " son iguales");
      }
	}

}
