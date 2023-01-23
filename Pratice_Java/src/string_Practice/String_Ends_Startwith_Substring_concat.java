package string_Practice;

public class String_Ends_Startwith_Substring_concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			// endsWith(),startsWith() method use----> 
			String c= "Maharashtra";
			System.out.println(c.endsWith("Maharashtra"));
			System.out.println(c.startsWith("Maha"));
			System.out.println(c.startsWith("aha", 1));
			System.out.println(c.startsWith("rara",4));
			System.out.println(c.endsWith("ra"));
			
			System.out.println("================================");
				//==============================================================
			
//			// substring() method use-->
			String d="I am in Pune";
			
			//  I  a m  i n  Pu n  e
			//  01 2 3 45 67 89 10 11
			System.out.println(d.substring(8));
				//using ref variable
			String d1 = d.substring(5);
			System.out.println("Substring is "+d1);
			System.out.println(d.substring(2, 4));  
			// it will start with index 2 and stop at index 4-1 =3
			System.out.println(d.substring(2, 6));
			System.out.println("================================");
//				//==============================================================
//			
			// concat() methos use-->
			String e1="Good ";
			String e2="Morning";
			String r2= "Softwere engg is ";
			String R3= "my dream";
			System.out.println( e1.concat(e2));
		    System.out.println(r2.concat(R3));
		   
			
			System.out.println(e1.concat("Night"));
			System.out.println("================================");

	}

}
