package logical_Programming;

import java.util.Scanner;

public class UserInputString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your 1st name:");
		
		String name =sc.next();
		
		String name2 = "";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			name2 = name2+name.charAt(i);
				
		}
		System.out.println();
		
		System.out.println("reverse string is :"+name2);

	}

}
