package logical_Programming;

public class NoWhiteSpace {

	public static void main(String[] args) {
		
		String a= "Pu n      e";
		
		char space =' ';
		int count=0;
		
		for(int i =0;i<=a.length()-1;i++)
		{
			
			if(a.charAt(i)==space)
			{
				count++;
			}
		}
		System.out.println("given String contain number of space :"+count);

	}

}
