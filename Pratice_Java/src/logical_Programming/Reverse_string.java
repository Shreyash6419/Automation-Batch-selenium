package logical_Programming;

public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//using string concatenation opeartor
		
		String ser1="shreyash";
		
		String ser2="";
		
		for (int i=ser1.length()-1;i>=0;i--)
		{
			ser2=ser2+ser1.charAt(i);
				
		}
		
		System.out.println(ser2);
	}

}
