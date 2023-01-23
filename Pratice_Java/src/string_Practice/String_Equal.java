package string_Practice;

public class String_Equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Smart"; // Stored in Constant Pool Area 
		
		String x = "Pune";  // Stored in Constant Pool Area 
		
		String y = "Pune";  // Stored in Constant Pool Area 
		
		String P = new String("Pune"); // Stored in non Constant Pool Area
		
		String Q = new String("Pune");    // Stored in non Constant Pool Area
		
		String R = new String("PUNE");   // Stored in non Constant Pool Area
		
		System.out.println(x==y);      // true bcz memory location is same 
		
		System.out.println(x==P);       // False bcz Memory location is different
		
		System.out.println(P==Q);           // (= =) equal to is comapre the l=memory location 
		
		System.out.println(Q==R); // this is stored in not constant pool area and having memory location is different 
		
		System.out.println(a==P);
		
		System.out.println("========================================");
		
		System.out.println(x.equals(y)); // Equals() to check contains inside variable 
		
		System.out.println(x.equals(P));
		
		System.out.println(P.equals(Q));
		
		System.out.println(x.equals(R));
		
		System.out.println(P.equals(R));
		
		System.out.println(x.equalsIgnoreCase(R));
		
		
		//System.out.println(a);

	}

}
