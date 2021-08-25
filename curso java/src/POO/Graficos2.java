package POO;

import java.awt.*;

import javax.swing.JFrame;
public class Graficos2 {

	public static void main(String[] args) {
		Graphis ventana = new Graphis();
       
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
}

class Graphis extends JFrame{
	
	public Graphis() {
		
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamanos = miPantalla.getScreenSize();
		
		int alto  = tamanos.height;
		int ancho = tamanos.width;
		setSize(ancho/2,alto/2);
		setLocation(ancho/4,alto/4);
		setTitle("Mi ventana (:");
		Image miImagen = miPantalla.getImage("world.jpg");
		setIconImage(miImagen);
	}
	
}
