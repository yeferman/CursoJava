package POO;
import java.util.*;

public class uso_Empleado {

	public static void main(String[] args) {
		
		/*Empleado empleado1 = new Empleado("Yeyson Quiñones", 10000,2,7,2000);
		
		Empleado empleado2 = new Empleado("Leixon Marin", 15000,2,7,2000);
		
		Empleado empleado3 = new Empleado("Elkin Miller Castro", 20000,2,7,2000);
		
		empleado1.setSueldo(5);
		empleado2.setSueldo(5);
		empleado3.setSueldo(5);
		
		System.out.println("Nombre: " + empleado1.getNombre()+"\nSueldo: "+ empleado1.getSueldo() +
				"\nContrato: "+empleado1.getDate()+ "\n");   
		
		System.out.println("Nombre: " + empleado2.getNombre()+"\nSueldo: "+ empleado2.getSueldo() +
				"\nContrato: "+empleado2.getDate()+ "\n");   
		

		System.out.println("Nombre: " + empleado3.getNombre()+"\nSueldo: "+ empleado3.getSueldo() +
				"\nContrato: "+empleado3.getDate() +"\n");  */
		
		Empleado empleados[] = new Empleado[3];
		
		empleados[0] = new Empleado("Yeyson Quiñones", 10000,2,7,2000);
		
		empleados[1] = new Empleado("Leixon Marin", 15000,2,7,2000);
		
		empleados[2] = new Empleado("Elkin Miller Castro", 20000,2,7,2000);
		
		
		for(int i =0 ;i<3;i++) {
			empleados[i].setSueldo(5);
			
		}
		
		for(int i =0;i<3;i++) {
			System.out.println("Nombre: " + empleados[i].getNombre()+"\nSueldo: "+ empleados[i].getSueldo() +
					"\nContrato: "+empleados[i].getDate()+ "\n");   
		}
	}
	
	
	/*for(Empleado e: empleados) {
		
		e.getSueldo();
	}*/

}

class Empleado{
	
	public Empleado(String nom, double sue, int dia, int mes, int agno) {
		
		nombre = nom;
		
		sueldo =sue;
		
		GregorianCalendar calendario = new GregorianCalendar(agno, mes, dia);
		altaContrato = calendario.getTime();
	}
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
	
	
	public String getNombre() {
		 
		 return nombre;
	 }
	 
	 public double getSueldo() {
		 
		 return sueldo;
	 }
	 
	 
	 public Date getDate() {
		 
		 return altaContrato;
	 }
	 
	 public void setSueldo(double porcentaje) {
		 
		 double aumento = (sueldo*porcentaje)/100;
		 sueldo +=aumento;
		 
	 }
	 
	
}


 
 


