package accessSpecifier1;

public class Specifier_test1 {
	
	
	private int a=10;
	int b = 20;
	protected int c = 30;
	//public d = 40;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Specifier_test1 t1 = new Specifier_test1();
		
		// Method Calling
		
		t1.demo1(); //calling private method within class
		t1.demo2(); // calling default method within class
		t1.demo3(); // calling protected method within class
		t1.demo4(); // calling public method within class
		
		
		// variable calling 
		
		System.out.println("");
		
		
		
		

	}
	
	private void demo1() {
		
		System.out.println("this is Private method");
	}
	
	void demo2() {
		
		System.out.println("this is default method");
	
	}
	protected void demo3() {
		System.out.println("this is protected method");
	
	}
	public void demo4() {
		
		System.out.println("this is public method ");
	}

}
