package Array_MatriX;

public class MultiDimension_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int max1[][] = new int[2][2];
		
		max1[0][0]= 10;
		max1[0][1]= 25;
		max1[1][0]= 88;
		max1[1][1]= 45;
		
		for(int i=0;i<=max1.length-1;i++)
		{
			for(int j=0;j<=max1.length-1;j++)
			{
				System.out.print(max1[i][j]+" ");
			}
			
			System.out.println();
		}
		

	}

}
