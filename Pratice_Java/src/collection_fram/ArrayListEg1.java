package collection_fram;

import java.util.ArrayList;

public class ArrayListEg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Comparable> call1 = new ArrayList();
		
		call1.add("school");
		call1.add(205);
		call1.add("uniform");
		call1.add(455);
		call1.add('K');
		call1.add(2, null);
		call1.add(null);
		call1.add(123.34f);
		call1.add(true);
		call1.add(false);
		
		
		System.out.println(call1);
		
		System.out.println(call1.size());
		
		System.out.println(call1.contains("school"));
		
		System.out.println(call1.contains(null));
		
		System.out.println(call1.get(4));
		
//		System.out.println(call1.get(25));// IndexOutOfBoundsException: 
		
		System.out.println(call1.indexOf(123.34f));
		
		System.out.println(call1.indexOf(null));
		
		System.out.println(call1.lastIndexOf(null));
		
		System.out.println(call1.isEmpty());
		
		System.out.println(call1.remove(4));// indexing number
		
		System.out.println(call1);
		
		//call1.clear();
		
		System.out.println(call1);
		
		call1.add("listeditem");
		
		System.out.println(call1);
		
		
		
		System.out.println("=====================================================================");
		
		for(Object d1:call1)
		{
			System.out.println(d1);
		}
		
		
		
		
	 
		

	}

}

