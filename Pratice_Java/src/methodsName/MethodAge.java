package methodsName;

public class MethodAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checkAge(20);

	}
	
	public static void checkAge(int x) {
		
		if (x>18) {
			
			System.out.println("Access Granted - you are old enough");
		}
		else {
			
			System.out.println("Access denied - your are not old!!");
		}
	}

}
