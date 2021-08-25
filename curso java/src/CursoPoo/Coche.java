package CursoPoo;

public class Coche {
	private int ruedas;
	
	private int largo;
	
	private int ancho;
	
	private int motor;
	
	private int peso_plataforma;
	
	String color;
	
	int peso_final;
	
	boolean asientos_cuero, climatizador;
	
	
	public Coche() {
		
		ruedas =4;
	
		largo= 2000;
		
		ancho=300;
		
		motor=3600;
		
		peso_plataforma=500;
		
		
	}
	public String getDatosGenerales() {
		return "El coche tiene "+ ruedas + "ruedas, un largo de: "+ largo + "\n"
				+ "El ancho es de " + ancho + "CM y un motor de "+motor;
	}
	
	public void setColor(String colorCoche) {
		this.color = colorCoche;
	}
	
	public String getColor() {
		return "El color del coche es: "+ this.color;
	}
	
	public void setAsientos(String asientosCuero) {
		 if(asientosCuero.equalsIgnoreCase("SI")) {
			 
			 this.asientos_cuero=true;
			 
		 }else {
			 this.asientos_cuero =false;
		 }
		 
		
	}
	
	 public String getAsientoscuero(){
		 if(this.asientos_cuero) {
			 
			 return "el conche tiene asientos de cuero";
		 }else {
			 return "el coche tiene aeientos normales";
		 }
	 }
	 
	 public String setPesoFinal() {
		
		int carroseria = 500;
		this.peso_final = carroseria;
		
		peso_final += peso_plataforma;
		
		if(this.asientos_cuero) {
			
			peso_final+=20;
		}
		
		if(this.climatizador) {
			peso_final+=50;
		}
		 
		return "peso final; " + peso_final;
		 
	 }
	 
	 
	 public int setCosto() {
		 
		int total = 10000;
		 
		if(this.asientos_cuero) {
			total+= 2000;
		}
		if(this.climatizador) {
			total+= 5000;
		}
		
		return total;
		 
		 
	 }

	
}
