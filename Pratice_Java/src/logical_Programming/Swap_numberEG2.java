package logical_Programming;

public class Swap_numberEG2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int a=10, b= 20;
		
		//logic without using 3rd number 
		
		System.out.println("Before Swapping value :"+ a +" "+ b);
		
		a= a+b; //10+20 =30
		b=a-b;  //30-20= 10		
		a=a-b;  // 30-10 = 20
		
		System.out.println("Before Swapping value :"+ a +" "+ b);

	}

}
