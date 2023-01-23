package inheritance;

public class Single_level {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Grandfather g = new Grandfather();
		
		g.experience();
		
		System.out.println("+++++++++++++++++++++++++++++++");
		
		Father_Subclass f = new Father_Subclass();
		
		f.nature();
		f.experience();
		
		System.out.println("--------------------------------------------");
		
		DaughterSubclass d = new DaughterSubclass();
		d.look();
		d.experience();
		d.nature();
		

	}

}
