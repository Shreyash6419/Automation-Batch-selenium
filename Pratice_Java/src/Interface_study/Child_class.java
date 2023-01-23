package Interface_study;

public class Child_class implements father_1,mother_1 {

	public void look() {
		System.out.println("look method completed child class");
		
	}

	@Override
	public void money() {
		System.out.println("money method completed child class");
		
	}

	@Override
	public void property() {
		System.out.println("property method completed child class");
		
	}

	@Override
	public void receipe() {
		System.out.println("receipe method completed child class");
		
	}

}
