package POO;

public class Viaje {

	public static void main(String[] args) {
		
		Problema vuelo = new Problema(400,5000); 
		
		vuelo.descuento();
		System.out.println(vuelo.getTotal());
		
        System.out.println(vuelo.getKilometros());
		
	}

}
