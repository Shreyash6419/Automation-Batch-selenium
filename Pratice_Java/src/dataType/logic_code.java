package dataType;

public class logic_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 53;		
		int b=0;
		
		if(a<=0 || a==1)
		{
			System.out.println("it is non prime number");
		}
		
		else
		{
		
		 for (int i = 2;i<a;i++)
		 {
			if(a%i==0)
					
			{
				b++;     
				
			}
		 }
			
			if(b==0)
			{
				System.out.println("it is prime number");
			}
			else
			{
				System.out.println("it is non prime number");
			}
				
			
			
		}
		}

	}



