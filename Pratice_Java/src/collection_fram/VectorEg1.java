package collection_fram;

import java.util.Iterator;
import java.util.Vector;

public class VectorEg1 {

	public static void main(String[] args) {
		
		
		Vector<Object> as1 = new Vector<>();
		
		as1.add("hi");
		as1.add('M');
		as1.add(123);
		as1.add(345.65f);
		as1.add(true);
		as1.add(null);
		as1.add("yes");
		as1.add(null);
		as1.add("addidas");
		as1.add(4582);
		as1.add("sms");
		as1.add('S');
		
		as1.add(3, "pune");// element shift to right 
		
		as1.remove(null);//element shift to left
		
		
		
		System.out.println(as1);
		
		System.out.println(as1.get(5));
		
		as1.remove(1);
		
		System.out.println(as1.contains(null));
		
		System.out.println(as1.capacity());
		
		System.out.println(as1.size());
		
		System.out.println(as1.isEmpty());
		System.out.println(as1.indexOf(4582));
		
		System.out.println("=======iterator======");
		
		Iterator<Object> s1 = as1.iterator();
		
		while(s1.hasNext())
		{
			System.out.println(s1.next());
		}
		System.out.println("=======for each======");
		
		for(Object a:as1)
		{
			System.out.println(a);
		}
		
		System.out.println("=======for loop====");
		
		for(int i =0;i<=10;i++)
		{
			System.out.println(as1.get(i));
		}
		

	}

}
