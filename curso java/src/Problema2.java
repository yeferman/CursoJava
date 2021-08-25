import javax.swing.*;
public class Problema2 {

	public static void main(String[] args) {
	  
		double guillermo = Integer.parseInt(JOptionPane.showInputDialog("Dinero de Guillermo"));
		
		double Juan = guillermo/2;
		
		double luis = (guillermo+Juan)/2;
		
		double Total = guillermo+Juan+luis;
		System.out.println("Total: " + Total);

	}

}
