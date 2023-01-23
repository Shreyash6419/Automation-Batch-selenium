package logical_Programming;

import java.util.Scanner;

public class Reverse_num2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner dc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		
		int tr1 = dc.nextInt();
		
		StringBuffer sb = new StringBuffer(String.valueOf(tr1));
		
		StringBuffer rev=sb.reverse();
		
		System.out.println("Reverse number is :"+rev);
		
		
		

	}

}
