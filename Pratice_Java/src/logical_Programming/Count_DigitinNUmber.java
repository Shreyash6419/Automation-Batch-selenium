package logical_Programming;

public class Count_DigitinNUmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=15154;
		
		int num2=0;
		
		
		while(num1>0)
		{
			num2=num2+num1%10;
			num1=num1/10;

		}
		System.out.println(num2);
	}

}
