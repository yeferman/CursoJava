
import javax.swing.*;
public class Cajero {

	public static void main(String[] args) {
	
		double saldo = 1000;
		
		int option = Integer.parseInt(JOptionPane.showInputDialog("Dijite una opcion: 1. Ingresar dinero a la cuenta"
				+"\n2.Retirar dinero de la cuenta \n3.Salir"));
		
		
		if(option == 1) {
					double abono = Double.parseDouble(JOptionPane.showInputDialog("Dijite saldo a depositar"));
			if(abono >0 ) {
				saldo+= abono;
				JOptionPane.showMessageDialog(null,"abonó: " +abono+" \nNuevo saldo: " + saldo);
			}
		}else if(option ==2) {
			double descuento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese monto a retirar"));
			
			if(descuento>saldo) {
				JOptionPane.showInputDialog("Operación invalida. EL valor ingresado excede el saldo");
			}else {
				saldo-=descuento;
				JOptionPane.showMessageDialog(null,"Se restó: " +descuento+ "\n Saldo nuevo: " +saldo);
			}
			
		}else if(option == 3){
			JOptionPane.showMessageDialog(null, "has salido");
		}else {
			
			JOptionPane.showMessageDialog(null, "Opción invalida");
		}
	}

}
