package Array_MatriX;

public class Array_test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//int num1[] = {10,20,30,40,50,60};
		
		//int[] num1 = {10,20,30,40,50};
		
		int[] num2 = new int[5];
		
		//array initailization
		
		num2[0]=10;
		num2[1]=20;
		num2[2]=30;
		num2[3]=40;
		num2[4]=50;
		
		
		System.out.println(num2[0]);
		System.out.println(num2[1]);
		System.out.println(num2[2]);
		System.out.println(num2[3]);
		System.out.println(num2[4]);
		System.out.println("=========================================================");
		
		//use for loop to print array
	
		for(int i=0;i<=num2.length-1;i++)
		{
			System.out.println(num2[i]);
			//sum1=num1[i];
			
			//num2[i]= sum1++;
			
			//System.out.println(num2[i]);
		}
		
		System.out.println("=========================================================");
		
		//use for loop to print array
	
		for(int i=num2.length-1;i>=0;i--)
		{
			System.out.println(num2[i]);
			//sum1=num1[i];
			
			//num2[i]= sum1++;
			
			//System.out.println(num2[i]);
		}
		
//		//System.out.println();
//		
//
	}

}
