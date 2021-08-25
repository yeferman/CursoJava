
public class Arrary2 {

	public static void main(String[] args) {
	
		int [] numbers = new int[10];
		
		
		for(int i=0;i<numbers.length;i++) {
			
			numbers[i] =(int) (Math.random()*100);
		}
		
		for(int elemento:numbers) {
			System.out.println(elemento);
		}

	}

}
