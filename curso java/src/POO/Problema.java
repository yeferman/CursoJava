package POO;

public class Problema {
	
	private double descuento;
	private float  precio;
	private double total;
	private int    kilometros;
	
	Problema(int kilometros,float precio){
		descuento = 0.2;
		this.precio    = precio;
		this.kilometros = kilometros;
	}
	
		public void descuento() {
	  if(this.kilometros >300) {
		  total = this.precio -(this.precio*descuento);
	  }else {
		  total= this.precio;
	  }
	  	
	}
	
	  public String getTotal() {
			if(this.kilometros >300) {
				return "Total: "+total +"\nse aplico un descuento de: "+this.precio*descuento;
			}else {
				return "Total: "+total +" \nNo se aplico ningun descuento";
			}
		  }
	     
	  public String getKilometros() {
		  
		  return "Se estima un total de: "+ this.kilometros + " KM";
		  
	  }
	  

}
