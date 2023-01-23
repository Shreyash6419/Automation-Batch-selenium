package logical_Programming;

public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//using string concatenation opeartor
		
		String ser1="MADAM";
		
		String ser2="";
		
		String org_ser=ser1;
		
		for(int i=ser1.length()-1;i>=0;i--)
		{
			ser2=ser2+ser1.charAt(i);
		}
		
		System.out.println(ser2);
		System.out.println(org_ser);
		
		if(ser2.equals(org_ser))
		{
			System.out.println("the given string is palindrome string");
		}
		else
		{
			System.out.println("the given string is not palindrome string");
			
		}

	}

}
