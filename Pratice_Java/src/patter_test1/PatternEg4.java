package patter_test1;

public class PatternEg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int star=1;
		
		for(int i=5;i>=1;i--)
		{
			for(int j=i;j>=star;j--)
			{
				System.out.print("* ");
			}
			// star++;
			System.out.println();
		}

	}

}
