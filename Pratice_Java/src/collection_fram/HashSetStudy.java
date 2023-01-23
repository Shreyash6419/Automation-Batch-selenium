package collection_fram;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashSetStudy {

	public static void main(String[] args) {
		
		HashSet<Object> Al = new HashSet<>();
		
		Al.add("pune");
		Al.add("pune");
		Al.add(null);
		Al.add(null);
		Al.add(true);
		Al.add(123);
		Al.add('M');
		Al.add(99.99f);
		
		System.out.println(Al);
		
		Object Sl1 = Al.clone();
		
		System.out.println(Sl1);
		
		//Al.clear();
		//System.out.println(Al.isEmpty());
		
		//System.out.println(Al);
		
		//System.out.println(Sl1);
		
		System.out.println(Al.contains(123));
		
		System.out.println(Al.equals(Sl1));
		
		Al.remove(true);
		
		System.out.println(Al);
		
		System.out.println(Al.size());
		
		//traversing method 
		
	
		for(Object q1:Al)
		{
			System.out.println(q1);
		}
		
		Iterator<Object> q2 = Al.iterator();
		
		while(q2.hasNext())
		{
			System.out.println(q2.next());
		}
		
		
		
 
	}

}
