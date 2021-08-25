package POO;

import java.util.Date;
import javax.swing.*;

import java.awt.Toolkit;
import java.awt.event.*;
import java.awt.*;

public class TimeCodeV2 {

	public static void main(String[] args) {
		
		Temporizador2 TimeTrap= new Temporizador2();
		TimeTrap.repetidor(3000,true);

	}

}


class Temporizador2{
	private int     tiempo;
	private boolean sonido;
	
	
	public Temporizador2( ) {
		
		this.tiempo = tiempo;
		
		this.sonido = sonido;
		
	}
	
	
	public void repetidor(int tiempo, final boolean sonido) {
		
		 class Trap implements ActionListener{
			
			
			public void actionPerformed(ActionEvent event) {
				
				Date hora = new Date();
				System.out.println("La hora es: "+ hora);
				
				if(sonido) {
					
					Toolkit.getDefaultToolkit().beep();
				}
				
			}
			
		}
		
		
		Trap oyente = new Trap();
		
		Timer begin = new Timer(tiempo, oyente);
		begin.start();
		
		JOptionPane.showMessageDialog(null, "Pausar");
		System.exit(0);
		
		
		
	}
	
	

	
}
