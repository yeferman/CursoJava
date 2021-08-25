
public class Array4 {

	public static void main(String[] args) {
		
		double [][]ganancia= new double[6][5];
		
		double acumulado=10000;
		double interes =0.01;
		
		for(int i=0;i<6;i++) {
			ganancia[i][0] =10000;
			
			for(int j=1;j<5;j++) {
				acumulado = acumulado+(acumulado*interes);
				ganancia[i][j] = acumulado;
				
			}
			interes+=0.01;
		}
		
		for(double []array:ganancia) {
			
			for(double z:array){
				System.out.println(z);
			}
		}

	}

}
