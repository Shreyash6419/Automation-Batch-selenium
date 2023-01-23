package patter_test1;

public class PatternEg2 {

	public static void main(String[] args) {
		
		
		// row-- 5 ,column -- 5
		
		// outer for loop --- Rows 1--> 5
		
		for(int i =0;i<=5;i++)
		{
			// inner for loop --- Column 1-->5
			for(int j=0;j<=5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
