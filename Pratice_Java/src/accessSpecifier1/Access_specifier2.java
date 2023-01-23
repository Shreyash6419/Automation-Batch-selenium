package accessSpecifier1;

public class Access_specifier2 {
	
	int a =20;
	private int b = 50;
	public int c=60;
	protected static int d=80;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Access_specifier2 dp = new Access_specifier2();
		
		dp.add();  //calling Private method - allow within class 
		
		dp.sub(); // calling public method - allowed within project 
		
		dp.mul(); //calling default method - allow within package
		
		display();
		
		
	}

		private void add() 
		{       // access specifier private
			
			int a,b=10,c=20;
			a=b+c;
			System.out.println("value of a is "+a);
			
		}
		
		public void sub() 
		{   // access specifier public
			
			int a,b=20,c=10;
			a=b-c;
			System.out.println("value of a is "+a);
		}
		
		void mul() 
		{         //  access specifier default 
			
			int a,b=20,c=10;
			a=b*c;
			System.out.println("value of a is "+a);
		}
		protected static void display()  // access specifier protected
		{
			System.out.println("hi i am protected method");
		}

	
}

		
		
		
		