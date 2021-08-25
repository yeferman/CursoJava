import javax.swing.JOptionPane;
public class Problema6 {

	public static void main(String[] args) {
     
	  int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad a pagar"));
	  
	  if(num>300) {
		  double descuento = num*0.2;
		  num-=descuento;
	  }
	  
	  System.out.println("Total: " + num);
	  
	  
	  
		

	}

}
