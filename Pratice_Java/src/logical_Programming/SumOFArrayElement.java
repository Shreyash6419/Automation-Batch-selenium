package logical_Programming;

public class SumOFArrayElement {

	public static void main(String[] args) {
		
		int[] a= {10,20,30,40,80,60};
		
		int x=0;
		
		for(int i=0;i<=a.length-1;i++)
		{
			x = x+a[i];
		}
		
		System.out.println(x);
		

	}

}
