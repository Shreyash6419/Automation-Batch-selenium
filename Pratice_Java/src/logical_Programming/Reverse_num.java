package logical_Programming;

import java.util.Scanner;

public class Reverse_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Sc =new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		
		int num = Sc.nextInt();
		
		int rev = 0;
		
		while(num!=0)
		{
			rev = rev*10+num%10;
			num =num/10;
		}
		
		System.out.println("Reverse Number is :"+rev);
		

	}

}
