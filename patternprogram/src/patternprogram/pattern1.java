package patternprogram;

public class pattern1 

{
	
	
	public  void A1()
	{
		System.out.println("pattern 1");
		for (int i=1 ; i<=5; i++)
		{
			
		for (int j =1;j<=i; j++)
		{
			System.out.print("*" + " ");
			
			
		}
			
			
		System.out.println( );	
			
			
			
		}
		
	
	System.out.println("    " );	
	}
	
	
	
		
	public  void A2()
	{ 
		System.out.println("pattern 2");
		for (int i= 5; i>=0 ; i--)
	    {
	    for (int j=0; j<=i; j++)
	    {
			System.out.print("*" +" ");
			
			
		}
			
			
		System.out.println( );	
			
			
	    }}
		
		
		
		
	public  void A3()
	{ 
		
		System.out.println("pattern 3");
	
		int i, j;
		for (i=0;i<5;i++)
		{
		
			
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
    
	}

	
	public static void main(String[] args) 
	
	{
		pattern1 obj = new pattern1();
		
		obj.A1();
		obj.A2();
		obj.A3();

	
	
	}

}
