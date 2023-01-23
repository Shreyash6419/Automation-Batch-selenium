package conditionalStatement;

public class Pattern_test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int star1=1;
		int space1=4;

		
		for(int i =1;i<=5;i++)
		{
			for(int j=1;j<=space1;j++)
			{
			System.out.print(" ");
			}
		
		    for(int k=1;k<=star1;k++)
		    {
			System.out.print("*");
		    }
		
		System.out.println("");
		
		star1=star1+2;
		
		space1--;

	}
		
	}
}
