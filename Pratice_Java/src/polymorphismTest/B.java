package polymorphismTest;

public class B extends A{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B s1 = new B();
		
		s1.test1();
		s1.test2();
		s1.test3();
		s1.test4();
		

	}

	@Override
	public void test3() {
		System.out.println("Test 3 complete in class B");
		
	}
	
	public void test4() {
		System.out.println("test 4 complete in class B");
	}

}
