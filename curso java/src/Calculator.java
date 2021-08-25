
public class Calculator {

	public static void main(String[] args) {
		
		
		double money = 3000000.0;
		
		
		for(int i= 0;i<7;i++) {
			
			money += (money*0.07);
			
		}
		
		System.out.println("Resultado: "+ money);
		
		
	}

}
