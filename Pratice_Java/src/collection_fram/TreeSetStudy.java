package collection_fram;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) {
		
		TreeSet<Object> tr1 = new TreeSet<>();
		
		
		tr1.add(4);
		tr1.add(7);
		tr1.add(5);
		tr1.add(2);
		tr1.add(1);
		tr1.add(6);
		tr1.add(8);
		
		System.out.println(tr1);
		
		System.out.println(tr1.first());
		
		System.out.println(tr1.floor(5));
		
		System.out.println(tr1.higher(5));
		
		System.out.println(tr1.lower(1));
		
		for(Object s1:tr1)
			
		{
			System.out.println(s1);
		}
		
		System.out.println("=================================================");
		
		Iterator<Object> d1 = tr1.iterator();
		
		while(d1.hasNext())
		{
			System.out.println(d1.next());
		}

	}

}
