package methodsName;

public class MethodsWithParamater {
	
	public static void students(String name,String branch) {
		
		System.out.println("Student name is "+name);
		System.out.println("Engg Branch "+branch);
	
	}
	
	public void city(String cityname,int pincode) {
		
		System.out.println("City name is "+cityname);
		System.out.println("pin code is "+pincode);
	}
	
	public static void add(int a,int b) {
		
		int sum = a+b;
		
		System.out.println("total sum is "+sum);
		
	}
	
	public void divi(int c,int d) {
		
		int div = c/d;
		
		System.out.println("output of division operation  "+c+"&"+d+"is "+div);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		students("Rohan","BE Civil");
		
		students("Akshay", "BE Mech");
		
		MethodsWithParamater ob = new MethodsWithParamater();
		
		ob.city("pune",411038);
		ob.city("mumbai",512026);
		

	}

	}
