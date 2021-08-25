import java.util.*;

import javax.swing.JOptionPane;

public class Exe2 {

	public static void main(String[] args) {
     
     boolean ciclo = true;
     
     Scanner leer = new Scanner(System.in);
     
     System.out.println("Dijite su nacionalidad  \n1: colombiano  \n2: otro");
     int nacionalidad = leer.nextInt();
     
     System.out.println("dijite su edad");
     int edad = leer.nextInt();
     int contador =0;
     
      while(ciclo) {
    	  System.out.println("dijite su respuesta");
    	String respuesta = leer.nextLine();
    	
    	if(respuesta.equalsIgnoreCase("S")) {
    		contador++;
    		
    		if(contador ==3) {
    			ciclo=false;
    		}
    		
    	}else if(respuesta.equalsIgnoreCase("N")){
    		ciclo =false;
    	}

      }
      System.out.println("ciclo terminado");
     
	}

}
