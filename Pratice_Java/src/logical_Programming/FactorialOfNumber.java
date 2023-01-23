package logical_Programming;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter number:");
		
		int num = sc.nextInt();
		
		int num2=1;
		
		for(int i =1;i<=num;i++)
		{
			num2=num2*i;
			
		}
		System.out.println("factorial of given numer :"+num2);
	}

}
