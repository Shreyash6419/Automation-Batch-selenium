package logical_Programming;

public class Reverse_string2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//using string Array
		
		String ser1="shreyash";
		String rev ="";
		
		char s1[]= ser1.toCharArray();
		
		
		
		for(int i=ser1.length()-1;i>=0;i--)
		{
			rev=rev+s1[i];
		}
		System.out.println(rev);
			
			
		
		
		
		

	}

}
