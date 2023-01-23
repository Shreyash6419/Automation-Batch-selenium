package constructorWithParameter;

import accessSpecifier1.Access_specifier2;

public class Specifier_use extends Access_specifier2  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Access_specifier2 dp3 = new Access_specifier2();
		
		dp3.sub();
		
		Access_specifier2.display(); //calling protected method of other class within same package-- allowed in same package/ need inheritance to call in another package

	}

}
