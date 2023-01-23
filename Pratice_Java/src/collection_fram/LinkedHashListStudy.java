 package collection_fram;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashListStudy {

	public static void main(String[] args) {
		
		
		LinkedHashSet<Object> hs1 = new LinkedHashSet<>();
		
		hs1.add(123);
		hs1.add(1.135f);
		hs1.add(null);
		hs1.add(null);
		hs1.add("pune"); 
		hs1.add("pune");
		hs1.add(true);
		hs1.add('r');
		
		System.out.println(hs1);
		
		System.out.println(hs1.isEmpty());
		System.out.println(hs1.size());

		
		System.out.println(hs1.size());
		System.out.println(hs1.contains(567));
		System.out.println(hs1.hashCode());
		
		System.out.println("================================for each====================");
		
		for(Object h1:hs1)
		{
			System.out.println(h1);
		}
		
		System.out.println("================================iteration====================");
		
		Iterator<Object> h2 = hs1.iterator();
		
		while(h2.hasNext())
		{
			System.out.println(h2.next());
		}
		
		
		

	}

}
