package logical_Programming;

import java.util.Scanner;

public class Reverse_number3 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("please enter number :");
		
		int a = sc.nextInt();
		int rev=0;
		
		while(a!=0)   //(456/10==6)
		{
			rev=rev*10+(a%10);
			a=a/10;
		}
		System.out.println("reverse number is :"+rev);

	}

}
