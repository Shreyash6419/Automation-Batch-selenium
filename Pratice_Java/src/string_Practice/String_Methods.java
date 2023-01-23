package string_Practice;

public class String_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// M A S T E R
		// 0 1 2 3 4 5---- Indexing position
		
		String d = "Master";
		
		System.out.println("here we are printing length "+d.length());
		
		// By using Reference Variable 
		
		int lengthstring = d.length();
		
		System.out.println("using reference variable :"+lengthstring);
		
		String s = "Testing is my skillset";
		
		String upaplh = "OUTSTANDING PERFORMANCE";
		
		int lens1 = s.length();
		
		System.out.println("length of string :"+s.length());
		
		System.out.println("reference string :"+lens1);
		
		int y = 10 + lens1;
		
		System.out.println(y);
		
		System.out.println(s.toUpperCase());
		System.out.println(upaplh.toLowerCase());
		
		String db = upaplh.toLowerCase();
		
		System.out.println(db);
			

	}

}
