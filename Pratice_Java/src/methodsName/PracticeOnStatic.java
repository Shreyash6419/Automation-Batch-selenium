package methodsName;

public class PracticeOnStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("i am inside main method");
		
		best(); // this is calling to regular static method 
		
		PracticeOnStatic ml = new PracticeOnStatic();
		
		ml.rest();
		
		System.out.println("i am back to main method");

	}
      
	public static void best() {
		
		System.out.println("i am outside main method but call me static");
	}
	public void rest() {
		System.out.println("i am non static mentod");
	}
}
