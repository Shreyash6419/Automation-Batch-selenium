package conditionalStatement;

public class Nested_IF_test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String UN1 = "Velocity";
		String PWD1 = "12";
		
		if (UN1=="Velocity") {
			
			System.out.println("Correct user name please enter Password");
		
			if (PWD1=="123") {
				
				System.out.println("login successfully");
			}
			
			else {
				
				System.out.println("password incorrect");
			}
		}
			else {
		   
		   System.out.println("usename is incorrect ");
	   }

		
		

				
	}

}

