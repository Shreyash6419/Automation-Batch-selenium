package logical_Programming;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter number :");
		
		int a = sc.nextInt();
		
		if(a%2==0)
			
		{
			System.out.println("Given number "+a+" is even");
		}
		else
		{
			System.out.println("Given number "+a+" is odd");
		}
		

	}
}
