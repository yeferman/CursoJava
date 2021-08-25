package POO;

import javax.swing.*;
import java.awt.event.*;
import java.util.Date;


public class TimeCode {

	public static void main(String[] args) {
		Temporizador obj= new Temporizador();
	     
		Timer tiempo = new Timer(5000,obj);
		tiempo.start();
		
		JOptionPane.showMessageDialog(null,"Pausar");
		
		System.exit(0);

	}

}

class Temporizador implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		
		Date hora= new Date();
		
		System.out.println("La hora es: " + hora);
	}
	
}
