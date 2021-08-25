import javax.swing.JOptionPane;

public class Mexclararray {

	public static void main(String[] args) {
		
		int array1[] = new int[10];
		int array2[] = new int[10];
		int array3[] = new int[20];
		
		for(int i =0;i<10;i++) {
		  array1[i] = Integer.parseInt(JOptionPane.showInputDialog("Array1. Dijite el elemento "+ i+1));
		  array2[i] = Integer.parseInt(JOptionPane.showInputDialog("Array2. Dijite el elemento "+ i+1));
		}
		
		for(int i=0;i<20;i+=2) {
			array3[i]=array1[i];
		
		}
		
		for(int e:array3) {
			System.out.println(e);
		}

	}

}
