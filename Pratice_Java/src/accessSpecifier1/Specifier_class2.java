package accessSpecifier1;

public class Specifier_class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Access_specifier2 dp1 = new Access_specifier2();
		
		//dp1.add();  //calling private method of other class within same package--not allowed in other class
		
		dp1.sub(); // calling public method of other class within same package-- allowed in project
		
		dp1.mul(); // calling default method of other class within same package-- allowed within package
		
		Access_specifier2.display();//calling protected method of other class within same package-- allowed in same package/ need inheritance to call in another package
		

	}

}
