package logical_Programming;

public class Number_Digitinnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=258964;
		
		int num2=0;
		
		while(num1!=0)
		{
			num1=num1/10;
			num2++;
		}
		
		System.out.println(num2 );

	}

}
