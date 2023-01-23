package patter_test1;

public class Patter_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int star =1;
		for(int i = 1;i<=4;i++)
		{
			for(int j=4;j>=star;j--)
			{
				System.out.print("*");
			}
			System.out.println();
			star++;
		}
		System.out.println("=========================================================");

		int star1 =4;
		for(int i = 1;i<=4;i++)
		{
			for(int j=1;j<=star1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star1--;
	}
	}

}


