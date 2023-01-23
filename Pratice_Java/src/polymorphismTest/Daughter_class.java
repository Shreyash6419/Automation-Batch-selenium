package polymorphismTest;

public class Daughter_class extends Mother_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Daughter_class d1 = new Daughter_class();
		
		d1.asset();
		System.out.println("===============================================");
		d1.money();

	}

	@Override
	public void money() {
		
		System.out.println("this method is belongs to mother but completed in daughter");
		
	}

	@Override
	public void asset() {
		// TODO Auto-generated method stub
		
		System.out.println("this 2nd method is belongs to mother but completed in daughter");
		
	}

}
