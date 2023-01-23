package constructorWithParameter;

public class CS {
	
	int a;
	int b;
	int c;
	float d;
	float e;
	
	int dd = 5;
	static int ee = 15;
	
	public CS() {
		
		a = 50;
		b = 100;
		c = 200;
		System.out.println("------------1st operation-------------");
		
	}
	
	public CS(int num1,int num2) {
		
		a = num1;
		b = num2;
		c = 20;
		System.out.println("------------2nd operation---------");
	}
	
	public CS(float num1,float num2) {
		
		d = num1;
		e = num2;
		System.out.println("------------3rd operation---------");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//CS obj = new CS();
		//obj.combine();
		
		CS obj1 = new CS(50,2);
		obj1.multi1();
		
		CS obj2 = new CS(10.5f,5.5f);
		obj2.addition();
		
		System.out.println("value of static glob variable "+ee);
		
		CS obj3 = new CS();
		System.out.println("value of non static variable "+obj3.dd);
		
		int see = ee+obj3.dd;
		
		System.out.println("addition of glob variable :"+see);
		
		
		
		
		
		

	}
	
	

	public void combine() {
		
		int output = (a+a)*b/c;
		
		System.out.println("output is "+output);
		
	}
	

	public void multi1() {
		
		int multi = a*b/c;
		System.out.println(" total value is "+multi);
}
	
	public void addition() {
		
		float add = d+e;
		 System.out.println("value is "+add);
		
	}
	
	public void add1() {
		
		int add = dd+ee;
		 System.out.println("value is "+add);
	}
	
	
}