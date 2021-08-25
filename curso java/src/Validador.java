import javax.swing.*;

public class Validador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
    String pass = "holaMundo";
	String password = JOptionPane.showInputDialog("Ingrese su contraseña");
	
	
	while(password.equalsIgnoreCase(pass) != true) {
		password = JOptionPane.showInputDialog("Ingrese su contraseña");
		
	}
	
	System.out.println("acceso permitido, congratulation");
	
	

	}

}
