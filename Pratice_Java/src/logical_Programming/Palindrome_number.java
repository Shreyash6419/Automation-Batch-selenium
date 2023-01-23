package logical_Programming;

import java.util.Scanner;

public class Palindrome_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner dt = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		
		int ral = dt.nextInt();
		
		int org_ral=ral;
		
		
		int rev=0;
		
		while(ral!=0)
		{
			rev= rev*10+ral%10;
			
			ral=ral/10;
		}
		
		if(rev==org_ral)
		{
			System.out.println("the given number is Palindrome number");
		}
		
		else
		{
			System.out.println("the given number is not Palindrome number");
		}
		

	}

}
