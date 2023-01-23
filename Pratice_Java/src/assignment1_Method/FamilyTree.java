package assignment1_Method;

public class FamilyTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("=======================Family details ========================");
		
		FamilyDetail();
		
		System.out.println("=======================Family details ========================");
		
		FamilyTree mini = new FamilyTree();
		
		mini.FamilyDetail01();
		
		System.out.println("=======================Family details ========================");
		
		FamilyDetail02(6,"Karvekar",27,5.10f,'M');
		
		System.out.println("=======================Family details ========================");
		
		mini.FamilyDetail03(6,"Karvekar",27,5.10f,'M');	

	}
	
	public static void FamilyDetail() {
		
		int member = 6;
		String Surname ="Karvekar";
		int age = 27;
		float height = 5.10f;
		char gender = 'M';
		
		
		System.out.println("number of family member is "+member);
		System.out.println("surname called as "+Surname);
		System.out.println("age of yougest person in Family is "+age);
		System.out.println("Ht of tallest member in family is "+height);
		System.out.println("Family Head gender is "+gender);
	}
    public  void FamilyDetail01() {
		
		int member = 6;
		String Surname ="Karvekar";
		int age = 27;
		float height = 5.10f;
		char gender = 'M';
		
		
		System.out.println("number of family member is "+member);
		System.out.println("surname called as "+Surname);
		System.out.println("age of yougest person in Family is "+age);
		System.out.println("Ht of tallest member in family is "+height);
		System.out.println("Family Head gender is "+gender);

     }

     public static void FamilyDetail02(int member,String Surname,int age,float height,char gender) {
	
	
	System.out.println("number of family member is "+member);
	System.out.println("surname called as "+Surname);
	System.out.println("age of yougest person in Family is "+age);
	System.out.println("Ht of tallest member in family is "+height);
	System.out.println("Family Head gender is "+gender);
}
    public void FamilyDetail03(int member,String Surname,int age,float height,char gender) {
	
	
	System.out.println("number of family member is "+member);
	System.out.println("surname called as "+Surname);
	System.out.println("age of yougest person in Family is "+age);
	System.out.println("Ht of tallest member in family is "+height);
	System.out.println("Family Head gender is "+gender);
}
}