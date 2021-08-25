
import java.util.Scanner;
public class Problema14 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		int []numeros = new int[5];
		
		for(int i=4;i>=0;i--) {
			System.out.println("ingrese el: "+ i+"° "+ "numero");
	      numeros[i] = leer.nextInt();
		}
		
		for(int e:numeros) {
			System.out.println(e);
		}
		

	}

}
