
import java.util.Scanner;
public class Problema {

	public static void main(String[] args) {

	 Scanner leer = new Scanner(System.in);
      
	 int contador=0,codigo,TotaLitros=0;
	 double precio=0,total=0;
	 
			 
	 for(int i =0;i<5;i++) {
		 do {
			   System.out.println("Ingrese  codigo de articulo");
			   codigo = leer.nextInt();
			   
			   if(codigo != 1 && codigo !=2 && codigo != 3) {
				   System.out.println("Ingrese un codigo valido");
			   }
			   
		 }while(codigo != 1 && codigo !=2 && codigo != 3);
			 
	   System.out.println("litros vendidos");
	   int cantidad = leer.nextInt();
	   
	     if(codigo ==1) {
	    	precio = 0.6; 
	    	
	     }else if(codigo==2) {
	    	precio = 3;
	    	
	     }else if(codigo ==3) {
	    	precio =1.25;
	     }
	     
	   
	   total = total + (precio*cantidad);
	   
	   if(codigo == 1) {
		   TotaLitros +=cantidad; 
	   }
	   
	   if(precio*cantidad>600) {
		   contador++;
	   }
	 }
	 
	 System.out.println("Facturación Total: " + total + "\ntotal litros art 1: " +
	 TotaLitros +"\nfacturas mayores a 600 " +contador);
	 
	 
	}

}
