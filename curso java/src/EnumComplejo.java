import java.util.Scanner;

public class EnumComplejo {
     enum Talla{
    	 
    	 PEQUEÑO("S"),MEDIANO("L"),GRANDE("XL");
    	 
    	 private Talla(String aberviatura) {
    		 
    		 this.abreviatura=aberviatura;
    	 }
    	 
    	 public String getAberviatura() {
    		 
    		 return abreviatura;
    	 }
    	 
    	 private String abreviatura;
    	 
     }
	public static void main(String[] args) {
		Scanner leer =new Scanner(System.in);
		
		
		System.out.println("Ingrese una talla: PEQUEÑO, MEDIANO, GRANDE");
		String entrada_datos = leer.next().toUpperCase();
		
		Talla mitalla = Enum.valueOf(Talla.class,entrada_datos);
		System.out.println("Talla: "+ mitalla);
		
		System.out.println("abreviatura: "+ mitalla.getAberviatura());
		
		
		

	}

}
