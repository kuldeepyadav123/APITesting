package patternprogram.A;

public class diamond 

{
	
	public static void main(String[] args) {
		
	
	int space = 6;
	
	 
     
  
     for (int i = 0; i < 7; i++) 
     { 
         
         for (int j = 0; j < space; j++) 
             System.out.print(" "); 
   
     
         for (int j = 0; j <= i; j++) 
             System.out.print("* "); 
   
         System.out.print("\n"); 
         space--; 
     } 
	
	 space = 0; 
     
     
     for (int i = 7; i > 0; i--) 
     { 
        
         for (int j = 0; j < space; j++) 
             System.out.print(" "); 
   

         for (int j = 0; j < i; j++) 
             System.out.print("* "); 
   
         System.out.print("\n"); 
         space++; 
     } 
 } 
	
	
}
