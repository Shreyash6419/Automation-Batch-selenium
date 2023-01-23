package Array_MatriX;

import java.util.Arrays;

public class Array_Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//char grade[] = {'A','B','C','D'};
		
		//int run[] = {10,15,16,85,19};
		
		String player[] = {"sachin","Rohit","rahul","yuvraj","MSdhoni"};
		
			for (int i=0;i<= player.length-1;i++)
			{
				System.out.println(player[i]);
			}
			System.out.println("=================");
			Arrays.sort(player);
			
			for(int i=0;i<=player.length-1;i++)
			{
				System.out.println(player[i]);
			}
			
			System.out.println("==========================");
			
			for(int i = player.length-1;i>=0;i--)
			{
				System.out.println(player[i]);
			}
			System.out.println("-----------------------");
			
			for(int i=0;i<= player.length-1;i++)
			{
				System.out.println(player[i]);
			}
			
			
			
			

	}

}
