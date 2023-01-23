
package collection_fram;

import java.util.ArrayList;

public class Collection_ArryList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("alex");
		name.add("Sherli");
		name.add("jorden");
		
		System.out.println(name);
		
		name.add("Rolex");
		
	    System.out.println(name);
    	name.add(2,"alonshry");
		
		System.out.println(name);
		
		name.remove(4);
		System.out.println(name);	
		
		name.remove(0);
		
//		  name.set(2, "jointaccount");
//		  
//		  System.out.println(name);
//		  
//		  System.out.println(name.get(2));
//		  
//		  name.clear();
//		  
//		  System.out.println(name);
		 
		System.out.println(name);

	}

}
