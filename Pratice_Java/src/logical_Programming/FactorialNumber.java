package logical_Programming;

public class FactorialNumber {

	public static void main(String[] args) {
		
		//A factorial is a funcation that multiplies a number by every number below it 
		
		// 5! = 5 X 4 X 3 X 2 X1 
		
		int num = 10;
		
		long fact = 1;
		
		for(int i =1; i<=num;i++)
		{
			fact= fact*i;
		}
		
		System.out.println("factorial of number is:"+fact);

	}

}
