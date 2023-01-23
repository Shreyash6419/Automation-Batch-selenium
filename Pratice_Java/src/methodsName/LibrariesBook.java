package methodsName;

public class LibrariesBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("well come to book store");
		
		//how to call static method form same class
		// declaration of method with its body out side main methods but in same class
		// now call to method inside main method 
		history();
		
		// how to call non static method form same class 
		// declaration of method with its body out side main methods but in same class
		// need to create object for non static method calling 
		LibrariesBook find = new LibrariesBook();
		find.marathi();
		
		// how to call non static method form other class 
	    // declaration of method with its body out side of class
		// need to create object for non static method calling 
		
		MyMethodPlay dl = new MyMethodPlay();
		
		dl.fresh();
		
		//how to call static method form other class
		// declaration of method with its body out side of class
	    // now call to method inside main method 
		
		MyMethodPlay.view();
		
		
		
	}
       public static void history() {   //this is method name, method declaration part
    	   
    	   System.out.println("here we can find all history books");   // this is regular static method body inclosed in curly bracket
       }
       public void marathi() {
    	   System.out.println("in this section u can find books related to marathi language");
       }
	
}
