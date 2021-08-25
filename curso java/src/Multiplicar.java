import java.util.Scanner;

public class Multiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
       
		System.out.println("Dijite un numero");
		int number = leer.nextInt();
		
		for(int i =1;i<=10;i++) {
	      System.out.println(i + " X "+ number+ " = "+ (number*i));
		}
	}

}
