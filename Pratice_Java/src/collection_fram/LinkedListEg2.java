package collection_fram;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEg2 {

	public static void main(String[] args) {
		
		LinkedList<Object> li = new LinkedList<>();
		
		
		li.add("mango");
		li.add("mango");
		li.add(123.67f);
		li.add(null);
		li.add("add");
		li.add(null);
		li.add(567);
		li.add(true);
		li.add(false);
		li.add(12345);
		
		System.out.println(li);
		
		System.out.println(li.indexOf(567));
				
		System.out.println(li.indexOf("mango"));
		
		System.out.println(li.lastIndexOf("mango"));
		
		System.out.println(li.size());
		System.out.println(li.contains(567));
		
		System.out.println(li.element());
		
		System.out.println(li.get(4));
		
		System.out.println(li.getFirst());
		
		System.out.println(li.getLast());
		
		System.out.println(li.offerFirst("luck"));
		
		System.out.println(li.offerLast("badluck"));
		
		System.out.println(li);
		
		System.out.println(li.peek());// retrive first element 
		
		System.out.println(li.peekFirst());
		System.out.println(li.peekLast());
		
		System.out.println(li.poll());// retrive and remove head element
		System.out.println(li.pollFirst());
		System.out.println(li.pollLast());
		
		System.out.println(li);
		System.out.println(li);
		
		System.out.println(li.pop());
		System.out.println(li);
	
		System.out.println(li);
		System.out.println(li.size());
		
		System.out.println(li.set(3, "market"));
		
		System.out.println(li);
		
		System.out.println(li.size());
		
		//for , for each, iterator, Listiterator
		
		System.out.println("=====================for loop=========================");
		
		for(int i =0;i<=li.size()-1;i++)
		{
			System.out.println(li.get(i));
		}
		System.out.println("=====================for each=========================");
		
		for(Object a1:li)
		{
			System.out.println(a1);
		}
		
		System.out.println("====================iterator =========================");
		
		
		Iterator<Object> s1 = li.iterator();
		
		while(s1.hasNext())
		{
			System.out.println(s1.next());
		}
		
		System.out.println("=========================listiterator===========================");
		
		ListIterator<Object> h1 = li.listIterator();
		
		while(h1.hasNext())
		{
			System.out.println(h1.next());
		}
		
		
		
		
		
		
		
	}

}
