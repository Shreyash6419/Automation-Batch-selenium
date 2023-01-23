package logical_Programming;

public class Count_oddevenInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=258964;
		
		int num2=0;
		
		int num3=0;
		int num4=0;
		
		while(num1>0)
		{
			num2=num1%10;
			
			if(num2%2==0)
			{
				num3++;
				
			}
			else
			{
				num4++;
				
			}
			num1=num1/10;

	}
		System.out.println("total even count :"+num3);
		
		System.out.println("Total odd count :"+num4);
		
		
		
	}

}
	
