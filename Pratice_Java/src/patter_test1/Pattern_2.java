package patter_test1;

public class Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int star =1,space=4;
		for(int i = 1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");	
			}
			
			for(int k = 1;k<=star;k++)
				{
					System.out.print("*");	
				}
				System.out.println();
				star++;
				space--;
		//System.out.println("=========================================================");

		}			
	
	
}

}
