package string_Practice;

public class String_Contains_empty_Charat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String f = "Velocity";
		
		// V E L O C I T Y 
		// 0 1 2 3 4 5 6 7
		
		System.out.println(f.charAt(6));
		System.out.println(f.charAt(4));
		
		System.out.println(f.contains("oci"));
		
		System.out.println(f.contains("oity"));
		System.out.println(f.contains("loct"));
		
		//isEmpty
		
		String a1="Pune";
		String a2="";
		String a3=" ";
		
		System.out.println("============================");
		System.out.println("a1 result is "+a1.isEmpty());
		System.out.println("a2 result is "+a2.isEmpty());
		System.out.println("a3 result is "+a3.isEmpty());
//		
//		// isBlank()---->
//		
//		// inBlank -- space and
//		
		System.out.println("=====================================");
		System.out.println("a1 result is "+a1.isBlank());
		System.out.println("a2 result is "+a2.isBlank());
		System.out.println("a3 result is "+a3.isBlank());
		System.out.println("================================");

	}

}
