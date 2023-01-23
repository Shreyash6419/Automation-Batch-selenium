package logical_Programming;

import java.util.Scanner;

public class FindLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter 1st value of:");
		int a= sc.nextInt();
		
		System.out.println("Please enter 2nd value of:");
		int b= sc.nextInt();
		
		System.out.println("Please enter 3rd value of:");
		int c= sc.nextInt();

		
		if(a>b && a>c)
			
		{
			
			System.out.println("largest number is :"+a);
		}
		
		else if(b>a && b>c)
		{
			System.out.println("largest number is :"+b);
		}
		
		else
		{
			System.out.println("largest number is :"+c);
		}

	}

}
