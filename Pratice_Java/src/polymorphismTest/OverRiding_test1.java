package polymorphismTest;

public class OverRiding_test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Father_Super f = new Father_Super();
		
		Son_Subclass s = new Son_Subclass();
		
		Father_Super f1 = new Son_Subclass();
		
		Father_Super f3 = new Daught_test();
		
		f.asset();
		f.money();
		
		System.out.println("===============================");
		
		s.asset();
		s.asset();
		
		System.out.println("===============================");
		
		f1.asset();
		f1.money();
		
		System.out.println("===============================");
		
		f3.asset();
		f3.money();
		

	}

}
