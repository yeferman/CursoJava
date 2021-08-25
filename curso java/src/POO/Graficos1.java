package POO;

import javax.swing.JFrame;

import javax.swing.*;
import java.awt.*;
public class Graficos1 {

	public static void main(String[] args) {
		
		
		Graficas ventana = new Graficas();
		
		ventana.setVisible(true);
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class Graficas extends JFrame{
	
	public Graficas() {
		
	//setSize(500,500);
	//setLocation(500,300);
		
    setBounds(500,300,500,500);
    
    //setResizable(false);
    //setExtendedState(Frame.MAXIMIZED_BOTH);
    setTitle("Mi primera ventana");
    
	
	}
	
}