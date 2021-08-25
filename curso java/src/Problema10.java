
import javax.swing.JOptionPane;
public class Problema10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Num 1"));
		
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Num 2"));
		
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Num 3"));
		
		if(num1>num2 && num1>3) {
			System.out.println(num1 + " es mayor que " + num2 + " y" + num3);
			
		}else if(num2>num3) {
			System.out.println(num2 + " es mayor que " + num1 + " y" + num3);
		}else {
			System.out.println(num3 + " es mayor que " + num1 + " y" + num2);
		}
		
	}

}
