
public class Array3 {

	public static void main(String[] args) {
		
        int [][] matrix = new int[4][5];
        
        matrix[0][0] = 32; 
        matrix[0][1] = 20;      
        matrix[0][2] = 55;      
        matrix[0][3] = 60;      
        matrix[0][4] = 24;      
        
        matrix[1][0] = 13; 
        matrix[1][1] = 98;      
        matrix[1][2] = 12;      
        matrix[1][3] = 17;      
        matrix[1][4] = 15;    
        
        matrix[2][0] = 100; 
        matrix[2][1] = 22;      
        matrix[2][2] = 92;      
        matrix[2][3] = 8;      
        matrix[2][4] = 3;    
        
        matrix[3][0] = 7; 
        matrix[3][1] = 45;      
        matrix[3][2] = 90;      
        matrix[3][3] = 88;      
        matrix[3][4] = 20;   
        
        
        /*for(int i=0;i<4;i++){
        	System.out.println();
        	for(int j=0;j<5;j++) {
        		System.out.println(matrix[i][j]);
        	}
        }*/
        
        for(int array[]: matrix) {
        	for(int z:array) {
        		
        		System.out.println(z);
        		
        	}
        }
            
        
     

	}

}
