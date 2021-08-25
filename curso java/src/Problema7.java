import javax.swing.JOptionPane;

public class Problema7 {

	public static void main(String[] args) {
		
		int horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese horas trbajadas"));
		float sueldo=0;
		
		if(horasTrabajadas<=40) {
			sueldo = horasTrabajadas*16;
	
		}else if(horasTrabajadas>40){
		    int horasExtras = horasTrabajadas-40;
		    float sueldoExtra = horasExtras*20;
		    
		    int horasNormales = horasTrabajadas-horasExtras;
		    
		    sueldo = sueldoExtra+(horasNormales*16);
		}
		
		System.out.println("el sueldo es de: " + sueldo);

	}

}
