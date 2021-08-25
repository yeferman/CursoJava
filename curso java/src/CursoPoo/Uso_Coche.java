package CursoPoo;

public class Uso_Coche {

	public static void main(String[] args) {
		
		Coche micoche = new Coche();
		
		
        micoche.setColor("Rojo");
       
        System.out.println(micoche.getColor());
        System.out.println(micoche.getDatosGenerales());
        
        micoche.setColor("si");
        micoche.setAsientos("No");
        
        
        
        System.out.println(micoche.setPesoFinal());
        System.out.println("Precio final: "+ micoche.setCosto());
  
	}
	

}
