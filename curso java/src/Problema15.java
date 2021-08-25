import javax.swing.JOptionPane;
public class Problema15 {

	public static void main(String[] args) {
	
		int numeros;
		
	  int numbers[] = new int[10];
	  
	  for(int i=0;i<10;i++) {
		 numbers[i] = Integer.parseInt(JOptionPane.showInputDialog("Dijite un numero")); 
	  }
	  
	  int num=9;
	  
	  for(int i=0;i<5;i++) {
		System.out.println(numbers[i]);
		System.out.println(numbers[num]);
		num--;
	  }
	  
	  

	}

}
