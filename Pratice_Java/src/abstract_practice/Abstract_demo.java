package abstract_practice;

public class Abstract_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Concrete_demo c = new Concrete_demo();
		Abstract_demo f = new Abstract_demo();
		
		c.test1();
		c.test2();
		c.test3();
		c.test4();
		f.test5();
		

	}
	
	public void test5() {
		
		System.out.println("this is test5 in own class");
	}

}
