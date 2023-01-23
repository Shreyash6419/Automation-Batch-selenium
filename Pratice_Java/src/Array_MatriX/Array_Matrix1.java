package Array_MatriX;

public class Array_Matrix1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int mat[][] = new int [2][2];
		
		mat[0][0] = 10;
		mat[0][1] = 20;
		mat[1][0] = 30;
		mat[1][1] = 40;
		
		
		//System.out.print(mat[0][0]+" ");
		
		//System.out.println(mat[0][1]);
		
		//System.out.print(mat[1][0]+" ");
		
		//System.out.print(mat[1][1]);
		
		
		for (int i=0;i<=mat.length-1;i++)
		{
			for(int j=0;j<=mat.length-1;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
		 	System.out.println();
		}
		
		System.out.println("==================================");
		
		int max[][]= new int[2][3];
		
		max[0][0] = 5;
		max[0][1] = 7;
		max[0][2] = 9;
		max[1][0] = 15;
		max[1][1] = 10;
		max[1][2] = 33;
		
		
		for(int i =0;i<= max.length-1;i++)
		{
			for(int j=0;j<=max[i].length-1;j++)
			{
				System.out.print(max[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
