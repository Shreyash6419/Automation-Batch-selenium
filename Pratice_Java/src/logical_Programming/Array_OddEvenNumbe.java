package logical_Programming;

public class Array_OddEvenNumbe {

	public static void main(String[] args) {
		
		int[] b = {10,20,33,44,50,63};
		
		for(int i=0;i<=b.length-1;i++)
		{
			if(b[i]%2==0)
			{
				System.out.println("even number :"+b[i]);
			}
			else
			{
				System.out.println("odd number :"+b[i]);
			}
		}

}
}